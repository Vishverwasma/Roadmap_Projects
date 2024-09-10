package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a Max number within what you wish to guess : ");
        int range = sc.nextInt();
        int randomNumber = random.nextInt(range) + 1;
        
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.print("Choose Your Difficulty Level: ");
        int difficulty = sc.nextInt();
        int difficultyAttempt=0;
        switch(difficulty){
            case 1:
            difficultyAttempt = 10;
            break;
            case 2:
            difficultyAttempt = 5;
            break;
            case 3:
            difficultyAttempt = 4;
            break;
            default:
            System.out.println("Enter a Valid difficulty level , By default , i am setting it to Easy level");
            difficultyAttempt = 10;
            break;
        };

        int guess = 0;
        int attempts = 0;

            while (attempts<=difficultyAttempt && guess != randomNumber) {
                System.out.print("Enter your guess (between 1 and "+range+") : ");
                guess = sc.nextInt();
                attempts++;

                if (randomNumber - guess == 0) {
                    System.out.println("Congratulations! You've guessed the number.");
                    System.out.println("It took you " + attempts + " attempts.");
                } else if (randomNumber - guess < 0) {
                    System.out.println("Too high! Try again.");
                } else if (randomNumber - guess > 0) {
                    System.out.println("Too low! Try again.");
                }
            }

        sc.close();
    }
}
