package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class PrimeGame {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static int roundCount = Engine.ROUND_COUNT;
    private static final int UPPER_BOUND_ROUND_INT = 279;

    private static String[][] getPrimeData() {
        int dataQuantity = 2;
        String[][] data = new String[roundCount][dataQuantity];
        Random random = new Random();

        for (var row = 0; row < roundCount; row += 1) {
            int question = random.nextInt(2, UPPER_BOUND_ROUND_INT);
            String correctAnswer = isPrime(question) ? "yes" : "no";

            data[row][0] = String.valueOf(question);
            data[row][1] = correctAnswer;
        }
        return data;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int stop = (int) Math.floor(num / 2);
        for (int i = 2; i <= stop; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        String[][] data = getPrimeData();
        Engine.engine(DESCRIPTION, data);
    }
}
