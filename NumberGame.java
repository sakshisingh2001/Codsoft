import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{
    public static void main(String[] args) 
    {
        Scanner mp = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int maxAttempts = 10;
        
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between " + minRange + " and " + maxRange + ".");

        while (playAgain) 
        {
            int userGuess;
            attempts = 0;

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                userGuess = mp.nextInt();
                attempts++;

                if (userGuess < minRange || userGuess > maxRange) 
                {
                    System.out.println("Please enter a valid number between " + minRange + " and " + maxRange + ".");
                    continue;
                }

                if (userGuess == targetNumber) 
                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) 
                {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }

            if (attempts == maxAttempts) 
            {
                System.out.println("Game over! The number was " + targetNumber + ". You're out of attempts.");
            }

            System.out.print("Do you want to play again? (Yes/No..Exit): ");
            String playAgainChoice = scanner.next().toLowerCase();
            playAgain = playAgainChoice.equals("yes");
            
            if (playAgain) 
            {
                targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            }
        }
        
        System.out.println("Your final score: " + score);
        System.out.println("Thank you for playing!");
    }
}
