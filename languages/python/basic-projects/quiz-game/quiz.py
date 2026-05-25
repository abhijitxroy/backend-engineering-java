print("Basic Quiz Game")
play = input("Do you want to play game? (Y/N) ")

score = 0

def quiz(score):
    q1 = "Who is Feluda? "
    a1 = str(input(q1))
    if( a1.lower() == 'pradosh c meter'):
        print("Correct")
        score += 1
    else:
        print("Wrong")

    q2 = "Who is topse? "
    a2 = str(input(q2))
    if( a2.lower() == 'topesh ranjan meter'):
        print("Correct")
        score += 1
    else:
        print("Wrong")
    return score

if play.lower() == 'y':
    print("So, lets play!")
    result = quiz(score)
    print("Your Score: "+ str(result) + "/2")
else:
    quit()

