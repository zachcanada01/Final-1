package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean playing = true;
		boolean x = true;
		 
		Scanner input = new Scanner(System.in);
		TicTacToe tictoe = new TicTacToe();
		
		tictoe.displayTemplate();
		
		
		do {
			if (x) {
				System.out.println("Player X Input a Number");
				tictoe.placePiece("X", input.nextInt());
				
				tictoe.displayMap();
				
				x = !x;
				
			} else {
				System.out.println("Player O Input a Number");
				tictoe.placePiece("O", input.nextInt());
				
				tictoe.displayMap();
				
				x = !x;
				
			}
			if(TicTacToe.Win() != null) {
				System.out.println((x ? "O" : "X") + "Winner");
				return;
			}
			
		}while(playing);
	
	}

}
