package io.github.lizalogvinenko.lesson_10;

public class Swap {

    public static <T> void swap(T[] array, int firstElement, int secondElement) {

        T temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
