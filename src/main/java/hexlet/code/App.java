package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.EvenOddGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Cli.greetUser();
                    return;
                case 2:
                    EvenOddGame.evenOddGame();
                    return;
                case 3:
                    CalcGame.calcGame();
                    return;
                case 4:
                    GcdGame.gcdGame();
                    return;
                case 0:
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
