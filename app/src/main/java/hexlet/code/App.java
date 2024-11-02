package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.EvenOddGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int  PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case GREET:
                    Cli.greetUser();
                    return;
                case EVEN:
                    EvenOddGame.evenOddGame();
                    return;
                case CALC:
                    CalcGame.calcGame();
                    return;
                case GCD:
                    GcdGame.gcdGame();
                    return;
                case PROGRESSION:
                    ProgressionGame.progressionGame();
                    return;
                case PRIME:
                    PrimeGame.primeGame();
                    return;
                case EXIT:
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
