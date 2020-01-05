package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please guess a number between 1 and 10:");

		
		int numGuess = input.nextInt(); // holds the info from the user

		// loop

		int guessAttempts = 0;
		int targetNum = ThreadLocalRandom.current().nextInt(1, 11); // did 11 instead of 10 --> inclusive of 10

		/*
		 * would show me the targetNum so I know it's working:
		 * System.out.println(targetNum);
		 */

		do {
			if (numGuess == targetNum) {
				System.out.println("Yay! That's correct! You win!");
				break;
			} else if (numGuess == 0) {
				System.out.println("Sorry, that's no good. Please guess a number between 1 and 10:");
				numGuess = input.nextInt();
			} else if (numGuess == -1) {
				System.exit(numGuess); // kills the program
			} else if (numGuess < targetNum) {
				System.out.println("Try a higher number");
				numGuess = input.nextInt();
			} else if (numGuess > targetNum) {
				System.out.println("Try a lower number");
				numGuess = input.nextInt();
			}
			guessAttempts += 1;

		} while (guessAttempts < 3); // condition - can be tested for true "while this is true"

		System.out.println("Done.");

		input.close();
	}
}
