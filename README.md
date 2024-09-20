```markdown
# Rock Paper Scissors Game in Java

This is a simple command-line Rock, Paper, Scissors game implemented in Java. The game allows the user to play against the computer, which randomly selects its choice. The rules are the classic:

- Rock crushes Scissors
- Scissors cuts Paper
- Paper covers Rock

## Features

- Single-player game where the user plays against the computer.
- Randomized computer choice.
- Best-of system or single round game mode.

## How to Play

1. The user selects their choice: Rock, Paper, or Scissors.
2. The computer randomly selects its choice.
3. The result is displayed: Win, Lose, or Draw based on the following rules:
    - Rock beats Scissors
    - Scissors beats Paper
    - Paper beats Rock

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or higher).
- A terminal or command line to run the game.

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/rock-paper-scissors-java.git
   ```

2. Navigate to the project directory:

   ```bash
   cd rock-paper-scissors-java
   ```

3. Compile the Java file:

   ```bash
   javac RockPaperScissors.java
   ```

4. Run the game:

   ```bash
   java RockPaperScissors
   ```

## Code Overview

The game is based on a simple Java program that uses:

- **Scanner**: For reading user input.
- **Random**: For generating a random choice for the computer.
- **Control Statements**: For decision making (if-else statements) to decide the winner.
