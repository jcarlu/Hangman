package com.techelevator.Hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hangman {

	private static int wrongGuess = 0;

	public static void main(String[] args) {
		String guess;
		List<String> wordList = new ArrayList<String>(Arrays.asList("WILDEBEEST", 
				"CORONAVIRUS", "DONALD TRUMP", "TROJAN HORSE", "PRETTY BIRD"));
		int wordNumber = (int)(wordList.size()*Math.random());
		String guessWord = wordList.get(wordNumber);
		String allAsteriks = "";
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < guessWord.length(); i++) {
			if (guessWord.charAt(i) == ' ' || guessWord.charAt(i) == '!')
				allAsteriks += guessWord.charAt(i);
			else
				allAsteriks += "*";
		}

		char[] processWord = allAsteriks.toCharArray();
		
		while (wrongGuess < 7) {
			boolean found = false;
			System.out.println(processWord);
			System.out.println("Enter a letter guess!");
			guess = (input.nextLine()).toUpperCase();
			for (int i = 0; i < guessWord.length(); i++) {
				if (guess.charAt(0) == guessWord.charAt(i)) {
					processWord[i] = guessWord.charAt(i);
					found = true;
				}
			}
			if (!found) {
				wrongGuess++;
				drawHangman();
			}
			String winner = new String(processWord);
			if(winner.contains("*")) {
					continue;
				}
				else {
				System.out.println(processWord);
				System.out.println("Yay!!!! You Win!!!!");
				System.out.println("Run Again To Play Another Round");
	            System.exit(0);
				}
	        
		 
//				else {
//					allAsteriks = processWord;
//					System.out.println(allAsteriks);
//				}	
		}

	}

	public static void drawHangman() {
		if (wrongGuess == 1) {
			System.out.println("Wrong Guess!");
			System.out.println("           ");
			System.out.println("              ");
			System.out.println("                 ");
			System.out.println("                ");
			System.out.println("                ");
			System.out.println("                ");
			System.out.println("              ");
			System.out.println("_________________");
		} else if (wrongGuess == 2) {
			System.out.println("Wrong Guess!");
			System.out.println("           ");
			System.out.println("      |        ");
			System.out.println("      |           ");
			System.out.println("      |          ");
			System.out.println("      |          ");
			System.out.println("      |          ");
			System.out.println("      |        ");
			System.out.println("______|___________");
		} else if (wrongGuess == 3) {
			System.out.println("Wrong Guess!");
			System.out.println("       _____    ");
			System.out.println("      |     |   ");
			System.out.println("      |           ");
			System.out.println("      |          ");
			System.out.println("      |          ");
			System.out.println("      |          ");
			System.out.println("      |        ");
			System.out.println("______|___________");
		} else if (wrongGuess == 4) {
			System.out.println("Wrong Guess!");
			System.out.println("       _____    ");
			System.out.println("      |    _|_   ");
			System.out.println("      |   |___| ");
			System.out.println("      |          ");
			System.out.println("      |        ");
			System.out.println("      |         ");
			System.out.println("      |       ");
			System.out.println("______|___________");
		} else if (wrongGuess == 5) {
			System.out.println("Wrong Guess!");
			System.out.println("       _____    ");
			System.out.println("      |    _|_   ");
			System.out.println("      |   |___| ");
			System.out.println("      |     |     ");
			System.out.println("      |     |      ");
			System.out.println("      |     |    ");
			System.out.println("      |     |  ");
			System.out.println("______|___________");
		} else if (wrongGuess == 6) {
			System.out.println("Wrong Guess!");
			System.out.println("       _____    ");
			System.out.println("      |    _|_   ");
			System.out.println("      |   |___|  ");
			System.out.println("      |     |     ");
			System.out.println("      |   |_|_|   ");
			System.out.println("      |     |    ");
			System.out.println("      |     |    ");
			System.out.println("______|___________");
		} else if (wrongGuess == 7) {
			System.out.println("Game Over!");
			System.out.println("Run Again To Play Another Round");
			System.out.println("       _____    ");
			System.out.println("      |    _|_   ");
			System.out.println("      |   |___| ");
			System.out.println("      |    _|_     ");
			System.out.println("      |   | | |    ");
			System.out.println("      |     |    ");
			System.out.println("      |   __|__   ");
			System.out.println("______|___________");
		}
	}

}
