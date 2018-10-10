package main;

public class TicTacToe {
	String[] board = {
			"0","1","2",
			"3","4","5",
			"6","7","8"
	};

	public void displayTemplate() {
		System.out.println("" 
		+ "\n0|1|2"
		+ "\n-----"
		+ "\n3|4|5"
		+ "\n-----"
		+ "\n6|7|8");
	}
	
	public void displayMap() {
		System.out.println("" 
				+ "\n" + board[0] + "|" + board[1] + "|" + board[2] + ""
				+ "\n-----"
				+ "\n" + board[3] + "|" + board[4] + "|" + board[5] + ""
				+ "\n-----"
				+ "\n" + board[6] + "|" + board[7] + "|" + board[8] + "");
	}
	
	public void placePiece(String piece, int position) {
		board[position] = piece;
	}
	
	public boolean win() {
		int x = 0;
		int o = 0;
		for (String piece : board) {
			if (piece.equalsIgnoreCase("x"))
				x++;
			else if (piece.equalsIgnoreCase("o"))
				o++;
		}
		
		if (x >= 3 || o >= 3)
			return checkWin();
		
		return false;
	}
	
	public boolean checkWin() {
		return true;
	}
}