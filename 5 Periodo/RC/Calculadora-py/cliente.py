import socket

def iniciar_cliente():
    HOST = '127.0.0.1'
    PORTA = 5000

    cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    cliente.connect((HOST, PORTA))

    try:
        while True:
            pergunta = cliente.recv(1024).decode()
            print(pergunta, end='')

            conta = input()
            cliente.send(conta.encode())

            resposta = cliente.recv(1024).decode()
            print(resposta)

            if "Encerrando" in resposta:
                break

    except Exception as e:
        print(f"[ERRO] {e}")
    finally:
        cliente.close()

if __name__ == "__main__":
    iniciar_cliente()
