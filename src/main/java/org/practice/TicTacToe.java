package org.practice;

import java.util.Scanner;

class TicTacToe{
    public static boolean isGameOver = false;

    public static void main(String[] args){
        char[][] board = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!\nChoose your Player (X or 0):");
        char player = scanner.next().charAt(0); // 'X' or 'O'
        TicTacToeBoard.initializeBoard(board);
        TicTacToeLogic.playerInput(board, player);
        TicTacToeBoard.printBoard(board);
    }
}