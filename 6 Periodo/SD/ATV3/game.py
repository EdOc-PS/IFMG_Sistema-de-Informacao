import turtle
import time

score = 0
high_score = 0

def start_game(proxy, id, my_initial_state, username, delay=0.1):
    wn = turtle.Screen()
    wn.title(f"Move Game by @Garrocho, Player: {username}")
    wn.bgcolor("green")
    wn.setup(width=1.0, height=1.0, startx=None, starty=None)
    wn.tracer(0)# Turns off the screen updates

    # Cria o jogador principal
    head = turtle.Turtle()
    head.speed(0)
    head.shape("circle")
    head.color(my_initial_state['color'])
    head.penup()
    head.goto(my_initial_state['x'], my_initial_state['y'])
    head.direction = "stop"

    # Dicionário para rastrear outros jogadores
    other_players_turtles = {}
    last_pos = (head.xcor(), head.ycor())

    # Funções de movimento
    def go_up():
        if head.direction != "down": head.direction = "up"
    def go_down():
        if head.direction != "up": head.direction = "down"
    def go_left():
        if head.direction != "right": head.direction = "left"
    def go_right():
        if head.direction != "left": head.direction = "right"
    def close():
        wn.bye()

    def move():
        if head.direction == "up": head.sety(head.ycor() + 2)
        if head.direction == "down": head.sety(head.ycor() - 2)
        if head.direction == "left": head.setx(head.xcor() - 2)
        if head.direction == "right": head.setx(head.xcor() + 2)

    # Controles
    wn.listen()
    wn.onkeypress(go_up, "w")
    wn.onkeypress(go_down, "s")
    wn.onkeypress(go_left, "a")
    wn.onkeypress(go_right, "d")
    wn.onkeypress(close, "Escape")

    # Loop principal do jogo
    while True:
        move()

        current_pos = (head.xcor(), head.ycor())
        if current_pos != last_pos:
            proxy.root.publish_move(id, current_pos[0], current_pos[1])
            last_pos = current_pos

        # Atualiza estado do jogo
        game_state = proxy.root.get_game_state()

        # Atualiza posição dos outros jogadores
        for player_id, state in game_state.items():
            if player_id == id:
                continue

            if player_id not in other_players_turtles:
                new_player_turtle = turtle.Turtle()
                new_player_turtle.speed(0)
                new_player_turtle.shape("circle")
                new_player_turtle.color(state['color'])
                new_player_turtle.penup()
                other_players_turtles[player_id] = new_player_turtle
                print(f"👤 Novo jogador detectado: {player_id[:8]}")

            other_players_turtles[player_id].goto(state['x'], state['y'])

        wn.update()
        time.sleep(delay)
