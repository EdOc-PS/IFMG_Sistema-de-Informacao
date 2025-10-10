import rpyc
from game import start_game 

host = 'localhost'
port = 18861

# objeto_arquivo = open('arquivo_teste.txt')

username = input("Nome de jogador: ")

print(f"\nConectando ao servidor em {host}:{port}...")

proxy = rpyc.connect(host, port, config={'allow_public_attrs': True})
id, player_content = proxy.root.register(username)
print(f"Player criado - ID: {id} - Nome: {username} - Cor: {player_content['color']}\n")

#n_linhas = proxy.root.contador_linha(objeto_arquivo)
#print('Numero de linhas no arquivo: ', n_linhas)

start_game(proxy, id, player_content, username)
