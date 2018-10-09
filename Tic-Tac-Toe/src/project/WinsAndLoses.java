package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WinsAndLoses {
	int wins = 0;
	int losses = 0;

	/**
	 * Initializes Saves
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public WinsAndLoses() throws NumberFormatException, IOException {
		FileReader win = new FileReader("wins.txt");
		FileReader loss = new FileReader("losses.txt");
		BufferedReader bufferedReader = new BufferedReader(win); 
		wins = Integer.parseInt(bufferedReader.readLine());
		bufferedReader = new BufferedReader(loss);
		losses = Integer.parseInt(bufferedReader.readLine());
	}
	
	/**
	 * Saves your scores
	 */
	public void save() {
		try {
			PrintWriter printWriter = new PrintWriter("losses.txt", "UTF-8");
			printWriter.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayWAL() {
		
	}
}
