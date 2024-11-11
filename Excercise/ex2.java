//⭐Rock,Paper,Scissors

import java.util.Scanner;
import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Options[] = { " ", "Rock", "Paper", "Scissor" };

        int userChoice = 0;

        // Generate ranom ComputerChoice
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;
        
        while (true) {
            // Get user choice.
            System.out.println("0. Exit \n1. Rock \n2. Paper \n3. Scissors\nEnter your choice:");
            userChoice = sc.nextInt();
        
            // Check whether the user choice is valid.
            if (userChoice >= 0 && userChoice <= 3) {
                if (userChoice == 0) {
                    System.out.println("Exiting the game. Goodbye!");
                    break; // Exit the loop if user chooses 0
                }
                // Valid choice (1, 2, or 3)
                break;
            } else {
                System.out.println("Invalid Input! Try Again.");
            }
        }
        

        System.out.printf("Your choice: %s\n", Options[userChoice]);
        System.out.printf("Cmputer choice: %s\n", Options[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("Tie!");
        }
        // ⭐⭐
        else if ((userChoice - computerChoice + 3) % 3 == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        sc.close();
    }

}
