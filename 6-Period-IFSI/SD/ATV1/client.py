import socket
import json
import csv
import xml.etree.ElementTree as ET
import yaml
import toml
from io import StringIO


message = {
    "Nome": input("Digite seu nome: "),
    "CPF": input("Digite seu CPF: "),
    "idade": input("Digite sua idade: "),
    "mensagem": input("Digite a mensagem: ")
}

# serializar
def serialize_csv(data):
    output = StringIO()
    writer = csv.DictWriter(output, fieldnames=data.keys())
    writer.writeheader()
    writer.writerow(data)
    return output.getvalue()

def serialize_xml(data):
    root = ET.Element("message")
    for k, v in data.items():
        child = ET.SubElement(root, k)
        child.text = str(v)
    return ET.tostring(root, encoding='unicode')

HOST = '127.0.0.1'
PORT = 8080 

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
    server.connect((HOST, PORT))
    
    formats = {
        "JSON": lambda d: json.dumps(d),
        "CSV": serialize_csv,
        "XML": serialize_xml,
        "YAML": lambda d: yaml.dump(d),
        "TOML": lambda d: toml.dumps(d)
    }
    
    for format, func in formats.items():
        body = func(message)
        
        # Envia o tipo
        server.sendall(format.encode())
        server.recv(1024)
        
        # Envia a menssagem
        server.sendall(body.encode())
        server.recv(1024)
        
        print(f"Mensagem em {format} enviada!")
