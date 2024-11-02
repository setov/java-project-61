package hexlet.code.games;
import java.util.Random;

import hexlet.code.Engine;

public class ProgressionGame {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    static int roundCount = Engine.ROUND_COUNT;
    private static final int LENGTH_PROGRESSION = 10;

    private static String[][] getProgressionData() {
        int dataQuantity = 2;
        String[][] data = new String[roundCount][dataQuantity];
        Random random = new Random();

        for (var row = 0; row < roundCount; row += 1) {
            int startSequence = random.nextInt(1, 21);
            int stepSequence = random.nextInt(2, 10);

            int[] progression = getProgression(startSequence, stepSequence, LENGTH_PROGRESSION);
            int randKey = random.nextInt(LENGTH_PROGRESSION);

            String correctAnswer = String.valueOf(progression[randKey]);
            String question = getQuestion(progression, randKey);

            data[row][0] = question;
            data[row][1] = correctAnswer;
        }
        return data;
    }

    private static int[] getProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String getQuestion(int[] progression, int randKey) {
        progression[randKey] = -1;
        StringBuilder questionBuilder = new StringBuilder();
        for (int num : progression) {
            if (num == -1) {
                questionBuilder.append(".. ");
            } else {
                questionBuilder.append(num).append(" ");
            }
        }

        String question = questionBuilder.toString().trim();
        return question;
    }

    public static void progressionGame() {
        String[][] data = getProgressionData();
        Engine.engine(DESCRIPTION, data);
    }
}
