import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;
        int maxAttempts = 7;
        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.\n");
        // Game loop
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println(" Too low! Try again.\n");
            } else {
                System.out.println(" Too high! Try again.\n");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println(" You've used all attempts. The correct number was: " + numberToGuess);
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}
