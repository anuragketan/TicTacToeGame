package org.practice;

import java.util.Scanner;

import static org.practice.TicTacToe.isGameOver;

public class TicTacToeLogic{
    public static void playerInput(char[][] board, char player){
        while (!isGameOver){
            TicTacToeBoard.printBoard(board);
            System.out.print("Player " + player + " enter: ");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();

            if (board[row][col] == ' '){
                board[row][col] = player; // place the element
                isGameOver = haveWon(board, player);
                if (isGameOver){
                    System.out.println("Player " + player + " has won: ");
                }else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            }else{
                System.out.println("Invalid move. Try again!");
            }
        }


    }

    public static boolean haveWon(char[][] board, char player){
        // check the rows
        for (int row = 0; row < board.length; row++){
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        // check for col
        for (int col = 0; col < board[0].length; col++){
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        // diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}
