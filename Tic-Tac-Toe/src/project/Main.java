package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean playing = true;
		boolean x = true;
		
		Scanner input = new Scanner(System.in);
	//	WinsAndLoses.displayWAL();
		TicTacToe tictoe = new TicTacToe();
		
		tictoe.displayTemplate();
		
		
		while (playing) {
			if (x) {
				System.out.println("Player X Input a Number");
				tictoe.placePiece("X", input.nextInt());
				
				tictoe.displayMap();
				
				x = !x;
				
				System.out.println("Type OKAY to continue >>");
				input.next();
			} else {
				System.out.println("Player O Input a Number");
				tictoe.placePiece("O", input.nextInt());
				
				tictoe.displayMap();
				
				x = !x;
				
				System.out.println("Type OKAY  to continue >>");
				input.next();
			}
			
			
			if (tictoe.win())
				System.out.println((x ? "o" : "x") + " Winner");
		}
		
	}

}
