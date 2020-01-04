package game;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please guess a number between 1 and 10:");
		
		int numGuess = input.nextInt();  // holds the info from the user
		
		if(numGuess == 7){
			System.out.println("Yay! That's correct! You win!");
		}
		else if(numGuess == 0) {
			System.out.print("Please guess a number between 1 and 10:");
		}
		
		else {
			System.out.println("Sorry, you lost.");
		}
	
		
		input.close();
	}

}
