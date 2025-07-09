package io.github.lizalogvinenko.lesson_7;

import java.util.Scanner;

public class ChecksSum {

    public static boolean checksSum() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }
}