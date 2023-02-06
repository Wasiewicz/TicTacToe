import java.util.Scanner;

public class GameBoard {

    public boolean playerTurn = true;
    public char playerMark = 'X';
    public char computerMark = 'o';
    public char[][] gameBoard =
            {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    public void playGame() {
        MechanicsOfTheGame mechanics = new MechanicsOfTheGame(this);
        mechanics.playGame(playerMark, computerMark);
    }

    public void printGameBoard() {
        for (int row = 0; row < gameBoard.length; row++) {
            for (int column = 0; column < gameBoard[row].length; column++) {
                System.out.print(gameBoard[row][column] + "\t");
            }
            // add new line after each row
            System.out.println();
        }

    }

    public void clearBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = (char) (j + i * 3 + 49);
                playerTurn = true;
            }
        }
        printGameBoard();
    }

    public void playerPickLocationOfMark() {

        System.out.println("Enter a position number from 1 to 9 ");
        int playerChoice = new Scanner(System.in).nextInt();
        System.out.println(playerChoice);
        switch (playerChoice) {
            case 1:
                if (gameBoard[0][0] == '1') {
                    gameBoard[0][0] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 2:
                if (gameBoard[0][1] == '2') {
                    gameBoard[0][1] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 3:
                if (gameBoard[0][2] == '3') {
                    gameBoard[0][2] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 4:
                if (gameBoard[1][0] == '4') {
                    gameBoard[1][0] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 5:
                if (gameBoard[1][1] == '5') {
                    gameBoard[1][1] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 6:
                if (gameBoard[1][2] == '6') {
                    gameBoard[1][2] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 7:
                if (gameBoard[2][0] == '7') {
                    gameBoard[2][0] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 8:
                if (gameBoard[2][1] == '8') {
                    gameBoard[2][1] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            case 9:
                if (gameBoard[2][2] == '9') {
                    gameBoard[2][2] = playerMark;
                    playerTurn = false;
                    System.out.println();
                    printGameBoard();
                } else {
                    System.out.println("Pick another number...");
                    printGameBoard();
                    playerPickLocationOfMark();
                }
                break;
            default:
                System.out.println("Wrong number!");
                playerPickLocationOfMark();
        }

    }

    public void computerPickLocationOfMark() {
        System.out.println("Computer's turn.");
        int computerChoice = (int) (Math.random() * 9) + 1;
        System.out.println(computerChoice);
        while (!playerTurn) {
            switch (computerChoice) {
                case 1:
                    if (gameBoard[0][0] == '1') {
                        gameBoard[0][0] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 2:
                    if (gameBoard[0][1] == '2') {
                        gameBoard[0][1] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 3:
                    if (gameBoard[0][2] == '3') {
                        gameBoard[0][2] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 4:
                    if (gameBoard[1][0] == '4') {
                        gameBoard[1][0] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 5:
                    if (gameBoard[1][1] == '5') {
                        gameBoard[1][1] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 6:
                    if (gameBoard[1][2] == '6') {
                        gameBoard[1][2] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 7:
                    if (gameBoard[2][0] == '7') {
                        gameBoard[2][0] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 8:
                    if (gameBoard[2][1] == '8') {
                        gameBoard[2][1] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
                case 9:
                    if (gameBoard[2][2] == '9') {
                        gameBoard[2][2] = computerMark;
                        playerTurn = true;
                        System.out.println();
                        printGameBoard();
                    } else {
                        computerPickLocationOfMark();
                    }
                    break;
            }
        }
    }

    public char[][] getGameBoard() {
        return gameBoard;
    }
}
