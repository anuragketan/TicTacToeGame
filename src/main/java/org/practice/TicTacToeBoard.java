package org.practice;

public class TicTacToeBoard{


    public static void initializeBoard(char[][] board){

        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(" | " + board[row][col] + " |");
            }
            System.out.println();
        }
    }
}
