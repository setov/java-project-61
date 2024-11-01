package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenOddGame {
    public static void evenOddGame(Scanner scanner) {

        Random random = new Random();

        String name = greetUser(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i += 1) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().trim().toLowerCase();

            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                    + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }


    private static String greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        return scanner.next();
    }
}
