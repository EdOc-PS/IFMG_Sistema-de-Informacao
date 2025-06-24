import socket
import threading

def calcular(expressao):
    try:
        return str(eval(expressao, {"__builtins__": None}, {}))
    except Exception as e:
        return f"Erro: {str(e)}"

def tratar_cliente(conexao, endereco):
    print(f"[+] Conectado com {endereco}")
    try:
        while True:
            conexao.send("Qual é a conta? (digite 'sair' para encerrar): ".encode())
            dados = conexao.recv(1024).decode().strip()

            if not dados or dados.lower() == "sair":
                conexao.send("Encerrando conexão".encode())
                break

            print(f"[{endereco}] Conta recebida: {dados}")
            resultado = calcular(dados)
            conexao.send(f"Resultado: {resultado}\n".encode())

    except Exception as e:
        print(f"[ERRO] Cliente {endereco} desconectou com erro: {e}")
    finally:
        print(f"[-] Conexão encerrada com {endereco}")
        conexao.close()

def iniciar_servidor():
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

if __name__ == "__main__":
    iniciar_servidor()
