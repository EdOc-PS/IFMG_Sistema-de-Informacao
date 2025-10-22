import paho.mqtt.client as mqtt, threading, json, subprocess, time

broker = "test.mosquitto.org"
port = 1883
players_searching = []
players_accepted = set()
timeout_thread = None 

def start_match_timeout():
    if len(players_accepted) < len(players_searching):
        print("Timeout. Partida cancelada.")
        players_accepted.clear()
        players_searching.clear()
        client.publish("/game/cancel-all", json.dumps({"start": True}))
        
def on_message(client, userdata, msg):
    data = json.loads(msg.payload.decode())
    global timeout_thread 
    
    if msg.topic == "/game/join":    
        players_searching.append(data["username"])
        print(f"{data["username"]} entrou.")

        if len(players_searching) == 2: 
            client.publish("/game/start", json.dumps({"start": True}))
            print("Partida encontrada;")
            timeout_thread = threading.Timer(10, start_match_timeout)
            timeout_thread.start()

    elif msg.topic == "/game/accept":
            if data["accepted"]:
                players_accepted.add(data["username"])
                print(f"{data['username']} aceitou")               

                if len(players_accepted) == len(players_searching):
                    subprocess.Popen(["python", "servidorRPC.py"])
                    client.publish("/game/start-game", json.dumps({"start": True}))
        
                    players_searching.clear()
                    players_accepted.clear()
            else:
                print(f"{data['username']} recusou")
                players_accepted.clear()
                players_searching.clear()
                timeout_thread.cancel()
                client.publish("/game/cancel-all", json.dumps({"start": True}))
            
        
    elif msg.topic == "/game/cancel":
        username = data["username"]
        if username in players_searching:
            players_searching.remove(username)
            print(f"{username} cancelou a busca.")

client = mqtt.Client()
client.on_message = on_message
client.connect(broker, port, 60)
client.subscribe("/game/join")
client.subscribe("/game/accept")
client.subscribe("/game/cancel")

print("Servidor aguardando jogadores")
client.loop_forever()
