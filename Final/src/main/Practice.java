package main;


public class Practice {
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
	}
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