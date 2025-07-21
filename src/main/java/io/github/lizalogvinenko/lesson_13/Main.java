package io.github.lizalogvinenko.lesson_13;

import java.util.Map;

import static io.github.lizalogvinenko.lesson_13.CountUniqueWords.countEachWord;
import static io.github.lizalogvinenko.lesson_13.CountUniqueWords.countUniqueWords;

public class Main {

    public static void main(String[] args) {
        String[] words = {"people", "word", "animal", "tree", "world", "laptop", "love", "pillow", "candle", "love", "tree"};

        int count = countUniqueWords(words);

        System.out.println("How many unique words: " + count);

        Map<String, Integer> eachWordCount = countEachWord(words);

        for (Map.Entry<String, Integer> word : eachWordCount.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }
    }
}
