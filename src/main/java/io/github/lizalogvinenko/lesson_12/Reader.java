package io.github.lizalogvinenko.lesson_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    public static void readFile(String fileName, AppData appData) {
        File file = new File(fileName);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed reading csv file", e);
        }
    }
}
