import socket
import json
import csv
import xml.etree.ElementTree as ET
import yaml
import toml
from io import StringIO
import ast

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
    server.bind((HOST, PORT))
    server.listen()
    print(f"Servidor rodando em {HOST}:{PORT}...")
    
    conn, addr = server.accept()
    with conn:
        
        # Recebe
        data = ast.literal_eval(conn.recv(4096).decode())  # string para dicionário
        
        # Serializa
        formats = {
            "JSON": json.dumps(data),
            "CSV": serialize_csv(data),
            "XML": serialize_xml(data),
            "YAML": yaml.dump(data),
            "TOML": toml.dumps(data)
        }
        
        # Devolve
        for fmt, body in formats.items():
            conn.sendall(f"\n{fmt}: \n{body}".encode())
