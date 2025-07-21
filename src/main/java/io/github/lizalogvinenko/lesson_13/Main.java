package io.github.lizalogvinenko.lesson_13;

import java.util.Map;

import static io.github.lizalogvinenko.lesson_13.CountUniqueWords.countUniqueWords;

public class Main {

    public static void main(String[] args) {
        String[] words = {
                "people", "word", "animal", "tree", "world",
                "laptop", "love", "pillow", "candle", "love", "tree"
        };

        int count = countUniqueWords(words);
        System.out.println("How many unique words: " + count);

        Map<String, Integer> uniqueWords = CountUniqueWords.countEachWord(words);
        for (Map.Entry<String, Integer> word : uniqueWords.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Ivanov", "12345678");
        phoneDirectory.add("Katz", "87654321");
        phoneDirectory.add("Katz", "5748336");

        System.out.println("Katz" + ": " + phoneDirectory.get("Katz"));
    }
}
