
package com.bridgelabz.workshop.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static char[] board = new char[10];
	static char player,computer;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getBoard();  // call for board
		getPlayer();  // call for option
	}
	
	// method for board 
	 static void getBoard() {
		 for (int i = 0; i < 10; i++) {
			 board[i] = '-';
		 }
	 }
	 
	 // method to choose the option
	 static void getPlayer() {
		 System.out.print("Choose an Option x or o : ");
		 player = scanner.next().charAt(0);
		 if (player == 'x')
			 computer='o';
		 else
			 computer ='x';
		 System.out.println("You Selected : " +player);
	    }
}
