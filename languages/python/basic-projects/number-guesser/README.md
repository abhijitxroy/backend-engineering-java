# Python Number Guesser Game

Number Guesser is a command-line Python project where users attempt to guess a randomly generated number. The project helps understand loops, conditions, input validation and random number generation.

## Coverage

Features:

- Random Number Generation
- User Input Handling
- Conditional Logic
- Loop Processing
- Input Validation
- Guess Counter

## Project Objective

Build a game where:

- User enters a maximum range
- Application generates a random number
- User keeps guessing until correct
- Program provides hints
- Application tracks total guesses

## Concepts Used

Project concepts:

- random Module
- Variables
- while Loop
- if else Conditions
- Type Conversion
- Input Validation

Random number example:

```python
import random

random_number = random.randint(
    0,
    max_range
)
```

Guess validation example:

```python
if user_guess > random_number:

    print(
        "You are above the number."
    )

elif user_guess < random_number:

    print(
        "You are below the number."
    )
```

Loop example:

```python
while True:

    user_guess = input(
        "Make a guess: "
    )
```

## Learning Outcome

After completing this project:

- Understand Random Number Generation
- Apply Conditional Logic
- Practice Loop Control
- Improve Problem Solving Skills
- Build Interactive Command Line Applications

## Backend Engineering Relevance

Number Guesser strengthens:

- Validation Logic
- User Input Processing
- Control Flow Design
- Application State Management