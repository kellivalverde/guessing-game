package game;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please guess a number between 1 and 10:");
		
		int numGuess = input.nextInt();  // holds the info from the user
		
		int guessAttempts = 0;
		
		while(guessAttempts < 3)  //condition  - can be tested for true "while this is true"
		
		if(numGuess == 7){
			System.out.println("Yay! That's correct! You win!");
			break;
		}
		else if(numGuess == 0) {
			System.out.println("Sorry, that's no good. Please guess a number between 1 and 10:");
			numGuess = input.nextInt();
		}	
		else if(numGuess == -1) {
			System.exit(numGuess);
		}	
		
		else {
			System.out.println("Sorry, you lost.");
			System.out.println("try again");
			guessAttempts += 1;
			
			 }
	
		
		input.close();
	}
}
