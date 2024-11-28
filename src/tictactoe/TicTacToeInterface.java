package tictactoe;

public interface TicTacToeInterface {
    void initializeBoard();
    void printBoard();
    boolean isBoardFull();
    boolean checkForWin();
    boolean placeMark(int row, int col);
    void changePlayer();
}
