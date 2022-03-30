package Game;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("..###..Welcome to Tic-Tac-Toe game..###..");
        TicTacToe game = new TicTacToe();
        game.creatingBoard();
    }

    private char[] creatingBoard() {
        @SuppressWarnings("unused")
        //creating a board for empty
        char board[] = new char[4];
        for (int i = 1; i < 4; i++) {
            board[i] = ' ';
            System.out.println("| " + board[i] + "| " + board[i] + "| " + board[i] + "| ");
        }
        return board;
    }

}