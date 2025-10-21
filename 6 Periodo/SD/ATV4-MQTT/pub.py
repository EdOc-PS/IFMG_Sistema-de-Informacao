import paho.mqtt.client as mqtt, tkinter, json, subprocess, time

broker = "localhost"
port = 1883

username = input("Nome de jogador: ")

client = mqtt.Client()
client.connect(broker, port, 60)

def screen_home():
    wn = tkinter.Tk()
    wn.title("Menu do Jogo")
    wn.geometry("250x100") 
    wn.config(bg="#ffffff")

    def to_screen_searching():
        wn.destroy()  
        screen_searching()
        

    btn = tkinter.Button(
        wn,
        text="Procurar Partida",
        font=("Sans", 10),
        bg="#e7e7e7",
        fg="black",
        padx=12,
        pady=3,
        command=to_screen_searching
    )
        
    btn.pack(expand=True)
    wn.mainloop()

def screen_searching():
        wn = tkinter.Tk()
        wn.title("Procurando Partida")
        wn.geometry("250x100")
        wn.config(bg="#ffffff")
 
        def to_cancel_searching():
             client.publish("/game/cancel", json.dumps({"username": username}))
             wn.destroy()
             screen_home()
             
        label = tkinter.Label(
            wn,
            text="Procurando partida...",
            font=("Sans", 10, "bold"),
            bg="#ffffff",
            fg="black"
        )
        label.pack(expand=True)

        btn = tkinter.Button(
            wn,
            text="Cancelar Busca",
            font=("Sans", 10),
            bg="#e7e7e7",
            fg="black",
            padx=12,
            pady=3,
            command=to_cancel_searching
        )
        btn.pack(expand=True) 

        play_game(wn)
        wn.mainloop()

def screen_accept_game():
        
        wn = tkinter.Tk()
        wn.title("Menu do Jogo")
        wn.geometry("250x100") 
        wn.config(bg="#ffffff")

        client = mqtt.Client()
        client.connect(broker, port, 60)

        accepted = {"value": False}
        teste1(wn)

        def to_play_game():
            accepted["value"] = True
            client.publish("/game/accept", json.dumps({
                "username": username,
                "accepted": True
            }))  

        def to_cancel_play_game():
                client.publish("/game/accept", json.dumps({
                    "username": username,
                    "accepted": False
                }))

        btnConfirm = tkinter.Button(
            wn,
            text="Aceitar",
            font=("Sans", 10),
            bg="#e7e7e7",
            fg="black",
            padx=12,
            pady=3,
            command=to_play_game
        )

        btnCancel = tkinter.Button(
            wn,
            text="Cancelar",
            font=("Sans", 10),
            bg="#e7e7e7",
            fg="black",
            padx=12,
            pady=3,
            command=to_cancel_play_game
        )
        
        btnConfirm.pack(expand=True) 
        btnCancel.pack(expand=True) 

        wn.mainloop() 

msg = json.dumps({"username": username})

def play_game(wn):
    client.publish("/game/join", msg)
    
    def on_message(client, userdata, msg):
        if msg.topic == "/game/start":
            wn.after(0, lambda: [wn.destroy(), screen_accept_game()])

    client.subscribe("/game/start")
    client.on_message = on_message
    client.loop_start()

def teste1(wn):
    def on_message(client, userdata, msg):
        if msg.topic == "/game/start-game":
            subprocess.Popen(["python", "./game/clienteRPC.py", username])
            wn.destroy()

        elif msg.topic == "/game/cancel-all":
            print("Partida cancelada")
            wn.after(0, lambda: [wn.destroy(), screen_searching()]) 

    client.subscribe("/game/cancel-all")
    client.subscribe("/game/start-game")
    client.on_message = on_message
    client.loop_start()


screen_home()