package io.github.lizalogvinenko.lesson_13;

import java.util.*;

public class CountUniqueWords {

    public static int countUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();

        Collections.addAll(uniqueWords, words);
        return uniqueWords.size();
    }

    public static Map<String, Integer> countEachWord(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
