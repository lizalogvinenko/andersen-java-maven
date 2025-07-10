package io.github.lizalogvinenko.lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public List<T> getFruits() {
        return fruits;
    }

    void add(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<?> other) {
        return this.getWeight() == other.getWeight();
    }

    public void transfer(Box<T> box) {
        box.fruits.addAll(this.fruits);

        this.fruits.clear();
    }
}
