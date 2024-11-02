package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class GcdGame {
    private static final String DESKRIPTION = "Find the greatest common divisor of given numbers.";
    private static int roundCount = Engine.ROUND_COUNT;

    private static String[][] getGcdData() {
        int dataQuantity = 2;
        String[][] data = new String[roundCount][dataQuantity];
        Random random = new Random();

        for (var row = 0; row < roundCount; row += 1) {
            int operandTwo = random.nextInt(2, 30);
            int operandOne = random.nextInt(operandTwo + 2, 40);
            int answer = gcd(operandOne, operandTwo);

            data[row][0] = operandOne + " " + operandTwo;
            data[row][1] = String.valueOf(answer);
        }
        return data;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void gcdGame() {
        String[][] data = getGcdData();
        Engine.engine(DESKRIPTION, data);
    }
}
