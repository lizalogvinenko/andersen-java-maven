package io.github.lizalogvinenko.lesson_7;

public class SwapArray {

    public static int[] swapArray() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
        }
        return numbers;
    }
}