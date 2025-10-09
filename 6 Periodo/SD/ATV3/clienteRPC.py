import rpyc
from game import start_game 

host = 'localhost'
port = 18861

username = input("Nome de jogador: ").strip() or "Jogador"

# Conexão
try:
    print(f"\nConectando ao servidor em {host}:{port}...")
    proxy = rpyc.connect(host, port, config={'allow_public_attrs': True})
    id, my_initial_state = proxy.root.register_player()
    print(f"Jogador Criado! ID: {id[:8]} - Nome: {username}\n")

except ConnectionRefusedError:
    print("\nNão é possível conectar ao servidor.")
    exit()

# Inicia o jogo
start_game(proxy, id, my_initial_state, username)
