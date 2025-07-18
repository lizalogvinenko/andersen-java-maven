package io.github.lizalogvinenko.lesson_12;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.deepToString(header) +
                ", data=" + Arrays.deepToString(data) +
                '}';
    }
}
