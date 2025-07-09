package io.github.lizalogvinenko.lesson_9;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, 500, 10);
    }

    @Override
    public void run(int distance) {
        if (distance < getRunLimit()) {
            super.run(distance);
        } else {
            System.out.println("Too long distance!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < getSwimLimit()) {
            super.swim(distance);
        } else {
            System.out.println("Too long distance!");
        }
    }
}
