package main;

import java.util.Scanner;

public class gamePlay {
	
	public static void displayGame() {
		int count = 0;
		boolean playing = true;
		boolean x = true;
		Scanner input = new Scanner(System.in);
		TicTacToe tictoe = new TicTacToe();
		
		tictoe.displayTemplate();
		do {
			if (x) {
				System.out.println("\n Player X Input a Number>>");
				tictoe.placePiece("X", input.nextInt());
				
				tictoe.displayMap();
				
				x = !x;
				count ++;
				
			
			} else {
				System.out.println("\n Player O Input a Number>>");
				tictoe.placePiece("O", input.nextInt());
				
				tictoe.displayMap();
				
				x = !x;
				
				count ++;
				
		
			}
			
			
			if (TicTacToe.win() != null)
			{
				System.out.println("\n        " + (x ? "O" : "X") + " Winner");
				return;
	
			}
			else if(count == 9)
			{
				System.out.println("\n        Draw");
				return;
				
			}
			
		
		}	while (playing || count != 9);
		
}



	
}
