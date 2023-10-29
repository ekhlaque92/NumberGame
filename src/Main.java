import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create a random number generator
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        // Create a scanner for user input
		Scanner scanner = new Scanner(System.in);

        // Initialize the number of attempts
        int guessAttempts = 0;

        int guess = 0;
		// Main game loop
        while (guessAttempts < 5 && guess != secretNumber) {

            // Get the player's guess
            System.out.print("Enter your guess btw 1 to 100: ");
            int guess1 = scanner.nextInt();

            // Check the player's guess
            guessAttempts++;
            if (guess1 < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess1 > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        // Display the final score
        if (guessAttempts == 5) {
            System.out.println("You have reached the maximum number of attempts! \n The correct number is " + secretNumber);
        } else {
            System.out.println("Congratulations! You guessed the correct number in " + guessAttempts + " attempts.");
        }
    }
}