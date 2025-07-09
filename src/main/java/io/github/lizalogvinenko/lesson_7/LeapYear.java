package io.github.lizalogvinenko.lesson_7;

public class LeapYear {

    public static boolean leapYear(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}