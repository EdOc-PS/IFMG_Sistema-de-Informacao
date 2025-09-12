import socket, yaml, toml, json, csv
import xml.etree.ElementTree as ET
from io import StringIO

def desserializar (data, formato):
    if formato == "JSON":
        msg_desserializada = json.loads(data)

    elif formato == "CSV":
        msg_desserializada = list(csv.DictReader(StringIO(data)))[0] 

    elif formato == "XML":
        msg_desserializada = {child.tag: child.text for child in ET.fromstring(data)}

    elif formato == "YAML":
        msg_desserializada = yaml.safe_load(data)

    elif formato == "TOML":
        msg_desserializada = toml.loads(data)

    print(f"\nDados em {formato}:")
    print(msg_desserializada)

host = '127.0.0.1'
port = 5731

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
    server.bind((host, port))
    server.listen()
    print(f"Servidor rodando em {host}:{port}")
    
    conn, addr = server.accept()

    with conn:
        for _ in range(5): 
            formato = conn.recv(1024).decode()
            conn.sendall(b"ACK")  

            data = conn.recv(4096).decode()
            conn.sendall(b"ACK")  

            desserializar(data, formato)

