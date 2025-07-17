package io.github.lizalogvinenko.lesson_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterCsv {

    public static void writeFile(String fileName, AppData appData) {
        File file = new File(fileName);
        file.delete();

        try (PrintWriter printer = new PrintWriter(file)) {
            String[] header = appData.getHeader();
            for (int i = 0; i < header.length; i++) {
                printer.write(header[i]);
                if (i != header.length - 1) {
                    printer.write(";");
                }
            }
            printer.write("\n");

            int[][] data = appData.getData();
            for (int[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    printer.write(String.valueOf(row[i]));
                    if (i != row.length - 1) {
                        printer.write(";");
                    }
                }
                printer.write("\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed writing csv file", e);
        }
    }
}
