package io.github.lizalogvinenko.lesson_11;

import static io.github.lizalogvinenko.lesson_11.BoundsSizeException.boundsSizeException;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] array = new String[4][4];
        boundsSizeException(array);
    }
}
