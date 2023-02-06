import java.util.Scanner;

public class MechanicsOfTheGame {
    char[][] currentBoard;
    private GameBoard gameBoard;

    public MechanicsOfTheGame(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        this.currentBoard = gameBoard.getGameBoard();
    }


    public void playGame(char playerMark, char computerMark) {
        while (!isGameWin(playerMark, computerMark) && !isGameDraw()) {
            if (gameBoard.playerTurn) {
                gameBoard.playerPickLocationOfMark();
                gameBoard.playerTurn = false;
            } else {
                gameBoard.computerPickLocationOfMark();
                gameBoard.playerTurn = true;
            }
        }
        if (isGameDraw()) {
            System.out.println("Draw...");
        } else if (isGameWin(gameBoard.playerMark, gameBoard.computerMark)) {
            if (gameBoard.playerTurn) {
                System.out.println("You lose...");
            } else {
                System.out.println("You Win!!!");
            }
        }
        playAgain();
    }

    public boolean isGameWin(char playerMark, char computerMark) {
        // Check horizontally
        for (int i = 0; i < 3; i++) {
            if (currentBoard[i][0] == playerMark && currentBoard[i][1] == playerMark && currentBoard[i][2] == playerMark) {
                return true;
            } else if (currentBoard[i][0] == computerMark && currentBoard[i][1] == computerMark && currentBoard[i][2] == computerMark) {
                return true;
            }
        }

        // Check vertically
        for (int j = 0; j < 3; j++) {
            if (currentBoard[0][j] == playerMark && currentBoard[1][j] == playerMark && currentBoard[2][j] == playerMark) {
                return true;
            } else if (currentBoard[0][j] == computerMark && currentBoard[1][j] == computerMark && currentBoard[2][j] == computerMark) {
                return true;
            }
        }

        // Check diagonally
        if (currentBoard[0][0] == playerMark && currentBoard[1][1] == playerMark && currentBoard[2][2] == playerMark) {
            return true;
        } else if (currentBoard[0][0] == computerMark && currentBoard[1][1] == computerMark && currentBoard[2][2] == computerMark) {
            return true;
        }


        if (currentBoard[0][2] == playerMark && currentBoard[1][1] == playerMark && currentBoard[2][0] == playerMark) {
            return true;
        } else if (currentBoard[0][2] == computerMark && currentBoard[1][1] == computerMark && currentBoard[2][0] == computerMark) {
            return true;
        }
        return false;
    }

    public boolean isGameDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (currentBoard[i][j] != gameBoard.computerMark && currentBoard[i][j] != gameBoard.playerMark) {
                    return false;
                }
            }
        }
        return true;
    }

    public void playAgain() {
        System.out.println("Do you want to play again? (y/n)");
        Scanner sc = new Scanner(System.in);
        String playAgain = sc.nextLine();
        if (playAgain.equals("y")) {
            gameBoard.clearBoard();
            playGame(gameBoard.playerMark, gameBoard.computerMark);
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}
