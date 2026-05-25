import random

# rock-paper-scissors game 
# Rock wins against scissors; 
# paper wins against rock; 
# scissors wins against paper.

user_win = 0
computer_win = 0



options = ["rock", "paper", "scissors"]


while True:
    user_input = input("Type rock/paper/scissors or Q to quit: ").lower()
    if user_input == 'q':
        break
    if user_input not in options:
        continue
    
    random_number = random.randint(0,2)
    computer_input = options[random_number]
    print("User input: ", user_input, " & Computer input: ", computer_input)
    if user_input=='rock' and computer_input == 'scissors':
        print("You won!")
        user_win += 1
    elif user_input=='paper' and computer_input == 'rock':
        print("You won!")
        user_win += 1
    elif user_input=='scissors' and computer_input == 'paper':
        print("You won!")
        user_win += 1
    else:
        print("You lost!")
        computer_win += 1

print("You won", user_win, " times.")
print("Computer won", computer_win, " times.")
print("Goodbye")

