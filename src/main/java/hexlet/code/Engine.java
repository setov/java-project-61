package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;

 /**
 * It welcomes the player, prompts for their name, and displays game instructions. For each round,
 * it presents a question and collects the player's answer. If the answer is correct, it notifies the player;
 * if incorrect, it displays the correct answer and ends the game.
 *
 * @param deskription A brief description of the game rules, guiding the player on how to respond.
 * @param gameData A 2D array containing the questions and their corresponding correct answers for the game.
 *                 Each row represents a round of the game:
 *                 - Element [0][i]: A string representing the question
 *                 - Element [1][i]: A string representing the correct answer
 */
    public static void engine(String deskription, String[][] gameData) {


        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(deskription);

        String[][] data = gameData;
        for (var round : data) {
            var question = round[0];
            var correctAnswer = round[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().trim().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                    + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                scanner.close();
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
