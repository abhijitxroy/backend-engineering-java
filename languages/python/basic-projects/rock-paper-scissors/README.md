# Python Rock Paper Scissors Game

Rock Paper Scissors is a command-line Python project where users play against the computer. The project helps understand loops, random number generation, conditions and game logic implementation.

## Coverage

Features:

- User Input Handling
- Random Number Generation
- Conditional Logic
- Score Tracking
- Loop Processing
- Game State Management

## Project Objective

Build an interactive game where:

- User selects rock, paper or scissors
- Computer generates a random choice
- Winner is decided using game rules
- Scores are tracked
- User can quit anytime

Game rules:

- Rock wins against Scissors
- Paper wins against Rock
- Scissors wins against Paper

## Concepts Used

Project concepts:

- random Module
- Variables
- List
- while Loop
- if elif else Conditions
- Input Validation

Random selection example:

```python
random_number = random.randint(
    0,
    2
)

computer_input = options[
    random_number
]
```

Input validation example:

```python
if user_input not in options:

    continue
```

Winner logic example:

```python
if user_input == "rock" and computer_input == "scissors":

    print(
        "You won!"
    )
```

## Learning Outcome

After completing this project:

- Understand Random Module Usage
- Apply Conditional Logic
- Build Interactive Command Line Applications
- Practice Loop Control
- Improve Problem Solving Skills

## Backend Engineering Relevance

Rock Paper Scissors strengthens:

- State Management
- Validation Logic
- Application Flow Design
- Decision Processing