package io.github.lizalogvinenko.lesson_11;

public class BoundSizeChecker {
    public static int boundSizeChecker(String[][] array) {
        int sum = 0;

        if (array.length != 4) {
            throw new MyArraySizeException("Array must be exactly 4 rows");
        }

        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Each row must have exactly 4 columns");
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String input = array[i][j];

                try {
                    int elementToInt = Integer.parseInt(input);
                    sum += elementToInt;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("You can input only number in " + "[" + i + "]" + "[" + j + "]" + " cell");
                }
            }
        }

        return sum;
    }
}
