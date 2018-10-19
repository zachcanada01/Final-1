
package main;



public class TicTacToe {

	static String[] board = {
			"0","1","2",
			"3","4","5",
			"6","7","8"
	};

	public void displayTemplate() {
		System.out.println("" 
		+ "\n        0 | 1 | 2"
		+ "\n       -----------"
		+ "\n        3 | 4 | 5"
		+ "\n       -----------"
		+ "\n        6 | 7 | 8\n");
	}
	
	
	
	
	public void placePiece(String piece, int position) {
		board[position] = piece;
	}
	
	static String win() {
		for (int a = 0; a<8; a++) {
			String line = null;
			switch (a) {
			case 0:
					line = board[0] + board [1] + board[2];
					break;
			case 1:
					line = board[3] + board [4] + board[5];
					break;
			case 2:
					line = board[6] + board [7] + board[8];
					break;
			case 3:
					line = board[0] + board [3] + board[6];
					break;
			case 4:
					line = board[1] + board [4] + board[7];
					break;
			case 5:
					line = board[2] + board [5] + board[8];
					break;
			case 6:
					line = board[0] + board [4] + board[8];
					break;
			case 7:
					line = board[2] + board [4] + board[6];
					break;
			}
			if(line.equals("XXX")) {
				return"x";
			}
			if(line.equals("OOO")) {
				return"o";
			}
	
			
			
		
		}
		return null;
		
	}
	public void displayMap() {
		System.out.println("" 
				+ "\n        " + board[0] + " | " + board[1] + " | " + board[2] + ""
				+ "\n       -----------"
				+ "\n        " + board[3] + " | " + board[4] + " | " + board[5] + ""
				+ "\n       -----------"
				+ "\n        " + board[6] + " | " + board[7] + " | " + board[8] + "\n");
	}
	

}




	