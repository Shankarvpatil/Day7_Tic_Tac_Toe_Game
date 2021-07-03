package com.bridgelabz.workshop.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static char[] board = new char[10];
	static char playerOption,computerOption;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getBoard();  // call for board
		getPlayerChoice();  // call for option
	}
	
	// method for board 
	 static void getBoard() {
		 for (int i = 0; i < 10; i++) {
			 board[i] = '-';
		 }
	 }
	 
	 // method to choose the option
	 static void getPlayerChoice() {
		 System.out.print("Choose an Option x or o : ");
		 playerOption = scanner.next().charAt(0);
		 if (playerOption == 'x')
			 computerOption='o';
		 else
			 computerOption ='x';
		 System.out.println("You Selected : " +playerOption);
	    }
}