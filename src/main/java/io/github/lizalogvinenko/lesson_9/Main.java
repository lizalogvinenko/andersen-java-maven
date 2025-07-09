package io.github.lizalogvinenko.lesson_9;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsic", 7);
        cats[1] = new Cat("Lexa", 9);
        cats[2] = new Cat("Liza", 10);
        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
    }
}
