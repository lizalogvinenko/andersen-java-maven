package io.github.lizalogvinenko.lesson_11;

import java.util.Scanner;

public class BoundsSizeException {
    public static void boundsSizeException(String[][] array) throws MyArraySizeException {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

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
                System.out.print("Enter a value for position [" + i + "][" + j + "]: ");
                String input = scanner.nextLine();
                array[i][j] = input;

                try {
                    int elementToInt = Integer.parseInt(input);
                    sum += elementToInt;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("You can input only number in " + "[" + i + "]" + "[" + j + "]" + " cell");
                }
            }
        }

        scanner.close();

        System.out.println(sum);
    }
}
