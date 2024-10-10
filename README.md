Title: Mini Project - Number Guessing Game

Overview:
This Java application is a simple number-guessing game where users try to guess a randomly generated number between 1 and 10. The game includes input validation and user-friendly feedback to enhance the experience.

Code Flow and Logic:
Initialization:
The program starts by creating a Scanner object for user input and initializing an integer variable "val" to store the user's guess.

Game Prompt:
The user is prompted to start guessing numbers. They can type -1 at any time to exit the game.

Game Loop:
A do-while loop runs continuously until the user correctly guesses the number or chooses to exit.

Random Number Generation:
Within the loop, a random number between 1 and 10 is generated. This number is the target that the user will try to guess.

User Input Handling:
The program reads the user’s input and assigns it to "val". An initial check verifies if the input is within the valid range (1 to 10) or if the user wants to exit by entering -1.

Guess Evaluation:
If the guess is valid, the program compares "val" with the random number:
- Correct Guess: If the guess matches the random number, the program congratulates the user and reveals the number.
- Too High: If the guess is greater than the random number, the user is prompted to guess lower.
- Too Low: If the guess is less than the random number and greater than or equal to 1, the user is encouraged to guess higher. Whether the guess is correct or not, the program provides the user with the correct number after each guess.

Input Validation:
If the user inputs a number outside the range or an invalid type, an exception is caught. The user is informed that only integers between 1 and 10 are acceptable, and the program prompts them to try again.

Exit Mechanism:
If the user enters -1, the game exits gracefully, ending the loop.

Conclusion:
This project demonstrates a logical flow where user input drives the game’s progression. The combination of loops, conditional statements, and error handling creates an interactive experience, allowing users to engage with the game while learning basic programming concepts.
