import rpyc
import random
from rpyc.utils.server import ThreadedServer

port = 18861

class GameServer(rpyc.Service):
    players = {}

    # def exposed_contador_linha(self, objeto_arquivo):
    #     n_linhas = len(objeto_arquivo.readlines())
    #     return n_linhas
    
    def exposed_register(self, username):
            id = str(random.randint(1000, 9999))
            colors = ["crimson", "aquamarine", "pink", "gold", "red", "brown", 
                      "blue", "yellow", "orange", "purple", "white", "cyan"]
            player_content = {
                'x': random.randint(-100, 100),
                'y': -300,
                'color': random.choice(colors),
                'username': username
            }
            self.players[id] = player_content
            print(f"Player registrado: {username} - Total: {len(self.players)}")
            return id, player_content

    def exposed_get_current_player_states(self):
            return dict(self.players)

    def exposed_remove_player(self, id):
           del self.players[id]
        
    def exposed_movements(self, id, x, y):
            if id in self.players:
                self.players[id]['x'] = x
                self.players[id]['y'] = y
                return True
            return False
    

if __name__ == "__main__":
    print(f"Rodando servidor rpyc em 127.0.0.1:{port}\n")
    t = ThreadedServer(GameServer, port=port, protocol_config={'allow_public_attrs': True})
    t.start()
