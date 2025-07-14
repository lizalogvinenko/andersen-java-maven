package io.github.lizalogvinenko.lesson_11;

import java.util.Scanner;
import static io.github.lizalogvinenko.lesson_11.BoundSizeChecker.boundSizeChecker;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] array = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter a value for position [" + i + "][" + j + "]: ");
                String input = scanner.nextLine();
                array[i][j] = input;
            }
        }
        scanner.close();

        try {
            int result = boundSizeChecker(array);
            System.out.println(result);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println((e.getMessage()));
        }
    }
}
