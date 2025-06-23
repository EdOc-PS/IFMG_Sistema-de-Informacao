import socket
import threading

def calcular(expressao):
    try:
        return str(eval(expressao, {"__builtins__": None}, {}))
    except Exception as e:
        return f"Erro: {str(e)}"

def tratar_cliente(conexao, endereco):
    print(f"[+] Conectado a {endereco}")
    while True:
        try:
            dados = conexao.recv(1024).decode()
            if not dados:
                break
            print(f"[{endereco}] Expressão recebida: {dados}")
            resultado = calcular(dados)
            conexao.send(resultado.encode())
        except:
            break
    print(f"[-] Conexão encerrada com {endereco}")
    conexao.close()

HOST = '127.0.0.1'
PORTA = 5000

servidor = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
servidor.bind((HOST, PORTA))
servidor.listen()

print(f"[SERVIDOR] Aguardando conexões em {HOST}:{PORTA}...")

while True:
    conexao, endereco = servidor.accept()
    thread = threading.Thread(target=tratar_cliente, args=(conexao, endereco))
    thread.start()
    print(f"[ATIVO] Conexões ativas: {threading.active_count() - 1}")
