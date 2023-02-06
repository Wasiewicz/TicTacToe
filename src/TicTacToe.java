public class TicTacToe {
    static public void main(String[]args){
        GameBoard gameBoard = new GameBoard();
        MechanicsOfTheGame mechanicsOfTheGame = new MechanicsOfTheGame(gameBoard);

        gameBoard.printGameBoard();
        mechanicsOfTheGame.playGame(gameBoard.playerMark, gameBoard.computerMark);

    }
}
