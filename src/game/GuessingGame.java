package game;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please guess a number between 1 and 10:");
		
		int numGuess = input.nextInt();  // holds the info from the user
		
		// loop
		
		int guessAttempts = 0;
		
		do {
			if(numGuess == 7){
				System.out.println("Yay! That's correct! You win!");
				break;
			}
			else if(numGuess == 0) {
				System.out.println("Sorry, that's no good. Please guess a number between 1 and 10:");
				numGuess = input.nextInt();
			}	
			else if(numGuess == -1) {
				System.exit(numGuess);   // kills the program
			}	
			else if(numGuess < 7){
				System.out.println("Try a higher number");
				numGuess = input.nextInt();
			}
			else if(numGuess > 7){
				System.out.println("Try a lower number");
				numGuess = input.nextInt();
			}
				guessAttempts += 1;
	
		} while(guessAttempts < 3);      //condition  - can be tested for true "while this is true"
	
		System.out.println("Done.");
		
		input.close();
	}
}
