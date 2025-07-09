package io.github.lizalogvinenko.lesson_7;

import java.util.Arrays;

public class ShiftArray {

    public static void shiftArray(int[] elements, int n) {
        int length = elements.length;
        if (length == 0) return;

        n = n % length;
        if (n < 0) n += length;

        reverse(elements, 0, length - 1);
        reverse(elements, 0, n - 1);
        reverse(elements, n, length - 1);

        System.out.println(Arrays.toString(elements));
    }

    private static void reverse(int[] elements, int start, int end) {
        while (start < end) {
            int temp = elements[start];
            elements[start] = elements[end];
            elements[end] = temp;
            start++;
            end--;
        }
    }
}