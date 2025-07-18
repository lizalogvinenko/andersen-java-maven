package io.github.lizalogvinenko.lesson_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderCsv {

    public static AppData readFile(String fileName) {
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            String[] header = scanner.nextLine().split(";");
            List<int[]> data = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(";");
                int[] dataRow = new int[splitLine.length];

                for (int i = 0; i < splitLine.length; i++) {
                    String element = splitLine[i];
                    int elementInt = Integer.parseInt(element);
                    dataRow[i] = elementInt;
                }
                data.add(dataRow);
            }

            return new AppData(
                    header,
                    data.toArray(new int[][]{})
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed reading csv file", e);
        }
    }
}
