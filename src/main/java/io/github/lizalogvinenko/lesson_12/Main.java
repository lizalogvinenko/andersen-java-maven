package io.github.lizalogvinenko.lesson_12;

public class Main {

    public static void main(String[] arg) {
        String fileName = "my_file_with_information.csv";

        String[] header = {"Num", "Kilo", "Age"};

        int[][] data = {
                {3, 2, 24},
                {9, 5, 30}
        };

        AppData appData = new AppData(header, data);

        WriterCsv.writeFile(fileName, appData);

        Reader.readFile(fileName, appData);
    }
}
