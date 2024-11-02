package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class EvenOddGame {
    private static final String DESKRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static int roundCount = Engine.ROUND_COUNT;

    private static String[][] evenOddData() {
        int dataQuantity = 2;
        String[][] data = new String[roundCount][dataQuantity];
        Random random = new Random();

        for (var row = 0; row < roundCount; row += 1) {
            int number = random.nextInt(1, 100);
            String answer = (number % 2 == 0) ? "yes" : "no";
            String question = String.valueOf(number);
            data[row][0] = question;
            data[row][1] = answer;
        }
        return data;
    }
    public static void  evenOddGame() {
        String[][] data = evenOddData();
        Engine.engine(DESKRIPTION, data);
    }
}
