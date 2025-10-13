import turtle
import time

# Score
score = 0
high_score = 0

def start_game(proxy, id, player_states, username):
    delay = 0.01

    # Set up the screen
    wn = turtle.Screen()
    wn.title(f"Move Game by @Garrocho, Player: {username}")
    wn.bgcolor("green")
    wn.setup(width=1.0, height=1.0, startx=None, starty=None)
    wn.tracer(0) # Turns off the screen updates

    # gamer 1
    head = turtle.Turtle()
    head.speed(0)
    head.shape("turtle")
    head.color(player_states['color'])
    head.penup()
    head.goto(player_states['x'], player_states['y'])
    head.direction = "stop"

    # Functions
    def go_up():
        head.direction = "up"

    def go_down():
        head.direction = "down"

    def go_left():
        head.direction = "left"
   
    def go_right():
        head.direction = "right"

    def close():
        proxy.root.remove_player(id)
        wn.bye()

    #aceleração
    def move():
        if head.direction == "up":
            y = head.ycor()
            head.sety(y + 2)

        if head.direction == "down":
            y = head.ycor()
            head.sety(y - 2)

        if head.direction == "left":
            x = head.xcor()
            head.setx(x - 2)

        if head.direction == "right":
            x = head.xcor()
            head.setx(x + 2)

    # Keyboard bindings
    wn.listen()
    wn.onkeypress(go_up, "w")
    wn.onkeypress(go_down, "s")
    wn.onkeypress(go_left, "a")
    wn.onkeypress(go_right, "d")
    wn.onkeypress(close, "Escape")

     # lista de outros players
    other_players = {}
    last_posistion = (head.xcor(), head.ycor())

    # Keyboard bindings
    while True:
        move()

        current_position = (head.xcor(), head.ycor())
        if current_position != last_posistion:
            proxy.root.movements(id, current_position[0], current_position[1])
            last_posistion = current_position
         
        for player_id, player_content in (proxy.root.get_current_player_states()).items():

            if player_id == id:
                continue

            if player_id not in other_players:
                new_player = turtle.Turtle()
                new_player.speed(0)
                new_player.shape("turtle")
                new_player.color(player_content['color'])
                new_player.penup()
                other_players[player_id] = new_player
                print(f"Player detectado: {player_content['username']}")
                
            other_players[player_id].goto(player_content['x'], player_content['y'])  

        for player_id in list(other_players): 
              if player_id not in (proxy.root.get_current_player_states()).keys():  
                print(f"Não esta mais: {player_id}")
                other_players[player_id].hideturtle()
                del other_players[player_id]
                

        wn.update()
        time.sleep(delay)
