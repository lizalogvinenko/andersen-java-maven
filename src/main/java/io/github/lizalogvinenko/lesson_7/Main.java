package io.github.lizalogvinenko.lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please select an example to run: ");
        System.out.println(
                """
                        - CheckSum
                        - PositiveNegativePrint
                        - PositiveNegativeReturn
                        - PrintStringNTimes
                        - LeapYear
                        - SwapArray
                        - FillingEmptyArray
                        - MultiplyBy2
                        - FillingDiagonalElements
                        - FixLength
                        - ShiftArray
                        """

        );

        final Scanner scanner = new Scanner(System.in);
        final String exampleName = scanner.nextLine();

        switch (exampleName) {
            case "CheckSum" -> runChecksSum();
            case "PositiveNegativePrint" -> runPositiveNegativePrint();
            case "PositiveNegativeReturn" -> runPositiveNegativeReturn();
            case "PrintStringNTimes" -> runPrintStringNTimes();
            case "LeapYear" -> runLeapYear();
            case "SwapArray" -> runSwapArray();
            case "FillingEmptyArray" -> runFillingEmptyArray();
            case "MultiplyBy2" -> runMultiplyBy2();
            case "FillingDiagonalElements" -> runFillingDiagonalElements();
            case "FixLength" -> runFixLength();
            case "ShiftArray" -> runShiftArray();
            default -> System.out.println("Unknown example: " + exampleName);
        }
    }

    private static void runFixLength() {
        System.out.println(Arrays.toString(FixLength.fixLength(5, 66)));
    }

    private static void runFillingDiagonalElements() {
        int[][] elements = FillingDiagonalElements.fillingDiagonalElements();
        for (int[] element : elements) {
            System.out.println(Arrays.toString(element));
        }
    }

    private static void runMultiplyBy2() {
        System.out.println(Arrays.toString(MultiplyBy2.multiplyBy2()));
    }

    private static void runFillingEmptyArray() {
        System.out.println(Arrays.toString(FillingEmptyArray.fillingEmptyArray()));
    }

    private static void runSwapArray() {
        System.out.println(Arrays.toString(SwapArray.swapArray()));
    }

    private static void runLeapYear() {
        final boolean result = LeapYear.leapYear(2017);
        System.out.println(result);
    }

    private static void runPrintStringNTimes() {
        PrintStringNTimes.printStringNTimes("haha", 5);
    }

    private static void runPositiveNegativeReturn() {
        final boolean result = PositiveNegativeReturn.positiveNegativeReturn(7);
        System.out.println(result);
    }

    private static void runPositiveNegativePrint() {
        PositiveNegativePrint.positiveNegativePrint(-6);
    }

    private static void runChecksSum() {
        final boolean result = ChecksSum.checksSum();
        System.out.println(result);
    }

    private static void runShiftArray() {
        int[] elements = {1, 2, 3};
        ShiftArray.shiftArray(elements, 1);
    }
}

