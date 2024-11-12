//⭐Rock,Paper,Scissors

import java.util.Scanner;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Options = { " ", "Rock", "Paper", "Scissors" };
        int userChoice;

        while (true) {
            // Generate random computer choice for each round
            Random random = new Random();
            int computerChoice = random.nextInt(3) + 1;

            // Get user choice
            System.out.println("0. Exit \n1. Rock \n2. Paper \n3. Scissors\nEnter your choice:");
            userChoice = sc.nextInt();

            // Check if user wants to exit
            if (userChoice == 0) {
                System.out.println("Exiting the game. Goodbye!");
                break; // Exit the loop if user chooses 0
            }

            // Check if the user choice is valid
            if (userChoice < 0 || userChoice > 3) {
                System.out.println("Invalid Input! Try Again.");
                continue; // Go to the next iteration if input is invalid
            }

            // Display choices
            System.out.printf("Your choice: %s\n", Options[userChoice]);
            System.out.printf("Computer choice: %s\n", Options[computerChoice]);

            // Determine the result
            if (userChoice == computerChoice) {
                System.out.println("Tie!");
            } else if ((userChoice - computerChoice + 3) % 3 == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println(); // Add a blank line for readability between rounds
        }

        sc.close();
    }
}
