import socket

HOST = '127.0.0.1'
PORTA = 5000

cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
cliente.connect((HOST, PORTA))

expressao = input("Digite a expressão (ex: 5 + 2 * 3): ")
cliente.send(expressao.encode())

resultado = cliente.recv(1024).decode()
print(f"Resultado: {resultado}")

cliente.close()
