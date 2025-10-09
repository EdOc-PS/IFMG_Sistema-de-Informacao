import rpyc
import random
import threading
from rpyc.utils.server import ThreadedServer

port = 18861

class GameService(rpyc.Service):
    players = {}
    lock = threading.Lock()

    def connect(self, conn):
        print("Novo jogador conectado.")

    def disconnect(self, conn):
        print("Jogador desconectado.")

    def exposed_register_player(self):
        with self.lock:
            player_id = str(random.randint(1000, 9999))
            colors = ["red", "blue", "yellow", "orange", "purple", "white", "cyan"]
            player_state = {
                'x': random.randint(-200, 200),
                'y': random.randint(-200, 200),
                'color': random.choice(colors),
                
            }
            self.players[player_id] = player_state
            print(f"🧍 Novo jogador registrado: {player_id[:8]} | Total: {len(self.players)}")
            return player_id, player_state

    def exposed_publish_move(self, player_id, x, y):
        with self.lock:
            if player_id in self.players:
                self.players[player_id]['x'] = x
                self.players[player_id]['y'] = y
                return True
            return False

    def exposed_get_game_state(self):
        with self.lock:
            return dict(self.players)

if __name__ == "__main__":
    print(f"Rodando em 127.0.0.1:{port}\n")
    t = ThreadedServer(GameService, port=port, protocol_config={'allow_public_attrs': True})
    t.start()
