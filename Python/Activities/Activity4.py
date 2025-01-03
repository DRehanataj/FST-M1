# Get the users names
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

# Get the users choices
while True:
    # Ask user 1 choice
    user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()

    # ask user2 choice
    user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()


    # Run the algorithm to see who wins
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()

    # If they say yes, don't do anything
    if(repeat == "yes" or repeat=="y"):
        pass
    # If they say no, exit the game
    elif(repeat == "no" or repeat=="n"):
        break
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        break
    print("Another round starting!")
print("En of game")