package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class CalcGame {
    private static final String DESKRIPTION = "What is the result of the expression?";
    private static int roundCount = Engine.ROUND_COUNT;

    private static String[][] getCalcData() {
        int dataQuantity = 2;
        String[][] data = new String[roundCount][dataQuantity];
        Random random = new Random();

        for (var row = 0; row < roundCount; row += 1) {
            int operationIndex = random.nextInt(3);
            int operandTwo = random.nextInt(1, 50);
            int operandOne = random.nextInt(operandTwo, 50);
            int answer;

            switch (operationIndex) {
                case 0: // Subtraction
                    answer = operandOne - operandTwo;
                    data[row][0] = operandOne + " - " + operandTwo;
                    data[row][1] = String.valueOf(answer);
                    break;

                case 1: // Addition
                    answer = operandOne + operandTwo;
                    data[row][0] = operandOne + " + " + operandTwo;
                    data[row][1] = String.valueOf(answer);
                    break;

                case 2: // Multiplication
                    answer = operandOne * operandTwo;
                    data[row][0] = operandOne + " * " + operandTwo;
                    data[row][1] = String.valueOf(answer);
                    break;
                default:
                    break;
            }
        }
        return data;
    }

    public static void  calcGame() {
        String[][] data = getCalcData();
        Engine.engine(DESKRIPTION, data);
    }

}
