import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    totalScore += (maxAttempts - attempts + 1); 
                    guessed = true;
                    break;
                } 
                else if (guess > number) {
                    System.out.println("Too high!");
                } 
                else {
                    System.out.println("Too low!");
                }
            }

            if (!guessed) {
                System.out.println("You lost! The number was: " + number);
            }

            System.out.println("Your total score: " + totalScore);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
