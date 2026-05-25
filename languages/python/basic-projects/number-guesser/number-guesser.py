import random

print("Number Guesser Game")
play = input("Do you want to play? (Y/N)")

guesses = 0

if play.lower() == 'y':
    print("Let's play")
    max_range = input("Enter a number: ")

    if max_range.isdigit():
        max_range = int(max_range)
    random_number = random.randint(0, max_range)
    print("Random Number: ", random_number)

    while True:
        guesses += 1
        user_guess = input("Make a guess: ")
        print("User Guess: ", user_guess, " & Random Number: ", random_number)
        if user_guess.isdigit():
            user_guess = int(user_guess)
            if user_guess <= 0 :
                print("Please type larger than 0 next time.")
                continue
        else:
            print("Please type a number next time")

        if user_guess == random_number:
                print("You got it!")
                break
        else:
        
            if user_guess > random_number:
                print("You are above the number.")
                continue
            elif user_guess < random_number:
                print("You are below the number.")
                continue

print("You got it in ", guesses, " guesses.")