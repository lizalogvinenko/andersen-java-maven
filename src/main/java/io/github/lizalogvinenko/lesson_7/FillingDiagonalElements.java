package io.github.lizalogvinenko.lesson_7;

public class FillingDiagonalElements {

    public static int[][] fillingDiagonalElements() {
        int[][] elements = new int[5][5];

        for (int i = 0; i < elements.length; i++) {
            elements[i][i] = 1;
            elements[i][elements.length - i - 1] = 1;
        }

        return elements;

        /*
         * Example for outputting the result
         *
         * <code>
         * for (int[] element : elements) {
         *     System.out.println(Arrays.toString(element));
         * }
         * </code>
         */
    }
}