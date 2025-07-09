package io.github.lizalogvinenko.lesson_9;

public class Cat extends Animal {
    private boolean fullness;
    private final int appetite;

    public Cat(String name, int appetite) {
        super(name, 200, 0);
        this.fullness = false;
        this.appetite = appetite;
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
        System.out.println("Cats can't swim!");
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return fullness;
    }

    public void eat(Bowl bowl) {
        fullness = bowl.consume(appetite);
        System.out.println(getName() + " is full: " + fullness);
    }
}
