import socket

HOST = '127.0.0.1'
PORT = 8080

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
    server.bind((HOST, PORT))
    server.listen()
    print(f"Servidor rodando em {HOST}:{PORT}...")
    
    conn = server.accept()
    with conn:
        print("- Conexão aceita -")
        for _ in range(5):
            # Recebe o formato
            format_type = conn.recv(1024).decode()
            conn.sendall(b"ACK")
            
            # Recebe a mensagem
            data = conn.recv(4096).decode()
            conn.sendall(b"ACK")
            
            print(f"\nMensagem recebida em {format_type}:")
            print(data)
