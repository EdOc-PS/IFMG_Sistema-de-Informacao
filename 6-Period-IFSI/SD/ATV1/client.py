import socket, json, csv, yaml, toml
import xml.etree.ElementTree as ET
from io import StringIO

menssagem = {
    "Nome": input("Nome: "),
    "CPF": input("CPF: "),
    "idade": input("Idade: "),
    "mensagem": input("Mensagem: ")
}

def serializa_csv(data):
    output = StringIO()
    writer = csv.DictWriter(output, fieldnames=data.keys())
    writer.writeheader()
    writer.writerow(data)
    return output.getvalue()

def serializa_xml(data):
    root = ET.Element("message")
    for k, v in data.items():
        filho_xml = ET.SubElement(root, k)
        filho_xml.text = str(v)
    return ET.tostring(root, encoding='unicode')

host = '127.0.0.1'
port = 5731

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
    server.connect((host, port))
    
    menssagem_serializada = {
        "JSON": lambda d: json.dumps(d),
        "XML": serializa_xml,
        "CSV": serializa_csv,
        "YAML": lambda d: yaml.dump(d), 
        "TOML": lambda d: toml.dumps(d)  
    }
    
    for formato, conteudo in menssagem_serializada.items():

        server.sendall(formato.encode())
        server.recv(1024) 
   
        server.sendall(conteudo(menssagem).encode())
        server.recv(1024) 
