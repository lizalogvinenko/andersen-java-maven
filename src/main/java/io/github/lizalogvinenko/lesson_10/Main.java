package io.github.lizalogvinenko.lesson_10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Box<Apple> applesBox = new Box<>();
        applesBox.add(new Apple());

        Box<Apple> applesBox2 = new Box<>();
        applesBox2.add(new Apple());

        Box<Orange> orangesBox = new Box<>();
        orangesBox.add(new Orange());

        applesBox.transfer(applesBox2);
        System.out.println("Quantity of apples in receiving box: " + applesBox2.getFruits().size());

        System.out.println("If weights of boxes are equal: " + applesBox.compare(orangesBox));

        String[] array = {"egg", "chicken"};

        Swap.swap(array, 0, 1);

        System.out.println("Array with swaped elements: " + Arrays.toString(array));
    }
}
