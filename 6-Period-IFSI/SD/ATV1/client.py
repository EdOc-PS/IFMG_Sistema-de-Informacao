import socket

HOST = '127.0.0.1'
PORT = 8080

message = {
    "Nome": input("Nome: "),
    "CPF": input("CPF: "),
    "idade": input("Idade: "),
    "mensagem": input("Mensagem: ")
}

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client:
    client.connect((HOST, PORT))
    
    client.sendall(str(message).encode())
    
    for _ in range(5):
        data = client.recv(4096).decode()
        print(data)
