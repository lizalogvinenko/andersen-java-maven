package io.github.lizalogvinenko.lesson_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {

    private final HashMap<String, List<String>> directory = new HashMap<>();

    public void add(String lastname, String phone) {
        if (directory.containsKey(lastname)) {
            directory.get(lastname).add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            directory.put(lastname, phones);
        }
    }

    public List<String> get(String lastname) {
        return directory.get(lastname);
    }
}
