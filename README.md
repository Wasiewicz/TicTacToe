# Tic-Tac-Toe Game

This is a simple implementation of the Tic-Tac-Toe game in Java. The game allows a player to play against a computer opponent.

## Prerequisites

To run this game, you need to have Java installed on your machine.

## How to Play

1. Clone the repository to your local machine.
2. Compile the Java source code using the following command:
   ```
   javac TicTacToe.java
   ```
3. Run the compiled Java class using the following command:
   ```
   java TicTacToe
   ```
4. The game will start, and the initial game board will be displayed.
5. The game will prompt you to enter a position number from 1 to 9. Each position corresponds to a cell on the game board.
6. Enter your choice, and the game will display the updated game board.
7. The computer opponent will automatically make its move, and the game board will be displayed again.
8. Continue alternating turns with the computer opponent until the game ends.
9. If a player wins or the game ends in a draw, the result will be displayed, and you will be prompted to play again or exit the game.

## Rules

1. The game is played on a 3x3 grid.
2. The player is represented by 'X', and the computer opponent is represented by 'O'.
3. Players take turns marking an empty cell on the grid with their respective marks.
4. The objective is to get three marks in a row, column, or diagonal.
5. If all cells are filled and no player has won, the game ends in a draw.

## Game Code Structure

The game code consists of multiple classes to handle different aspects of the game. Here's an overview of the classes and their responsibilities:

### GameBoard

The `GameBoard` class represents the game board and contains methods related to printing the board, clearing the board, and allowing players to pick the location of their marks.

### MechanicsOfTheGame

The `MechanicsOfTheGame` class implements the game mechanics, including checking for a win or draw condition, playing the game turns, and handling the play again option.

### TicTacToe

The `TicTacToe` class contains the main method to start the game. It initializes the `GameBoard` and `MechanicsOfTheGame` objects and starts the game loop.

## Contribution

Contributions to this Tic-Tac-Toe game are welcome. If you find any issues or have any suggestions, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
