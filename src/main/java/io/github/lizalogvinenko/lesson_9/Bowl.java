package io.github.lizalogvinenko.lesson_9;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int addFood(int add){
        food += add;
        return food;
    }

    public boolean consume(int appetite){
        if (food >= appetite){
            food -= appetite;
            return true;
        } else {
            return false;
        }
    }
}
