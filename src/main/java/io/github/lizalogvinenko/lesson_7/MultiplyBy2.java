package io.github.lizalogvinenko.lesson_7;

public class MultiplyBy2 {

    public static int[] multiplyBy2() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        return numbers;
    }
}