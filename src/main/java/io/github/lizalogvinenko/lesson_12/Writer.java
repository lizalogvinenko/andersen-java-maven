package io.github.lizalogvinenko.lesson_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {

    public static void writeToCSVFile(String fileName, AppData appData) {
        File file = new File(fileName);
        file.delete();

        try (PrintWriter printer = new PrintWriter(file)) {

            String[] header = appData.getHeader();
            for(String element: header){
                printer.write(element + ";");
            }
            printer.write("\n");

            int[][] data = appData.getData();
            for (int[] row : data) {
                for (int element : row) {
                    printer.write(element + ";");
                }
                printer.write("\n");
            }

            System.out.println("Writing is complete");

        } catch (
                FileNotFoundException e) {
            System.out.println("Error with writing to file");
        }
    }
}
