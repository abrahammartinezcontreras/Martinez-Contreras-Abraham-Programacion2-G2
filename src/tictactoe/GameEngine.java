package tictactoe;

import java.util.Scanner;

public class GameEngine {
    private Player player1;
    private Player player2;
    private TicTacToe game;

    public GameEngine(String player1Name, String player2Name) {
        player1 = new Player(player1Name, 'X');
        player2 = new Player(player2Name, 'O');
        game = new TicTacToe(player1);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        boolean gameWon = false;

        while (!game.isBoardFull() && !gameWon) {
            game.printBoard();
            int row, col;
            do {
                System.out.println(currentPlayer.getName() + ", enter your move (row and column): ");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!game.placeMark(row, col));

            gameWon = game.checkForWin();
            if (!gameWon) {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
                game.changePlayer(currentPlayer);
            }
        }

        game.printBoard();
        if (gameWon) {
            System.out.println("Congratulations! " + currentPlayer.getName() + " wins!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}

