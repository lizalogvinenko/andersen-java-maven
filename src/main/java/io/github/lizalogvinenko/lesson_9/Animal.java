package io.github.lizalogvinenko.lesson_9;

public class Animal implements Runable, Swimable {
    private final String name;
    private final int runLimit;
    private final int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public String getName() {
        return name;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void info() {
        System.out.println("Name " + name);
    }

    @Override
    public void run(int distance) {
        if (distance == 1) {
            System.out.println(name + " run " + distance + " meter");
        } else {
            System.out.println(name + " run " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance == 1) {
            System.out.println(name + " swam " + distance + " meter");
        } else {
            System.out.println(name + " swam " + distance + " meters");
        }
    }
}
