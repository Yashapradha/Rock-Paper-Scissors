import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"rock", "paper", "scissors"};
        String userMove;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your move (rock, paper, scissors). Type 'stop' to end the game: ");
            userMove = scanner.nextLine().toLowerCase();

            // If the user types 'stop', break the loop and end the game
            if (userMove.equals("stop")) {
                System.out.println("Game ended. Thanks for playing!");
                break;
            }

            // Check for invalid input
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move! Please enter rock, paper, or scissors.");
                continue;  // Continue to the next iteration
            }

            // Computer randomly selects a move
            String computerMove = rps[random.nextInt(3)];
            System.out.println("Computer move: " + computerMove);

            // Determine the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                       (userMove.equals("paper") && computerMove.equals("rock")) ||
                       (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
