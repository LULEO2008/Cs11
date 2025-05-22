package u4;
import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        char playAgain;
        do {
            System.out.println("enter your choose (0 - Rock, 1 - Paper, 2 - Scissors): ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3);
            System.out.println("computer choose: " + choices[computerChoice]);
            if (userChoice == computerChoice) {
                System.out.println("draw!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                System.out.println("you Win!");
            } else {
                System.out.println("you Lost!");
            }
            System.out.print("Do you want to play it again? (y/n): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
        scanner.close();
    }
}
