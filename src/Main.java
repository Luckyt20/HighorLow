import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        do {
            Random generator = new Random();
            int val = generator.nextInt(10) + 1;
            int guess = 0;
            System.out.println("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess == val) {
                    System.out.println("You guessed it!");
                } else {
                    System.out.println("Sorry, the number was " + val);
                }
            } else {
                // consume the non-int token
                System.out.println("Invalid input. Please enter a number next time.");
                scanner.next();
            }

            System.out.println("Would you like to play again? (y/n)");
            String resp = scanner.next();
            if (resp.equalsIgnoreCase("n")) {
                done = true;
            }
        } while (!done);
        scanner.close();
    }
}
