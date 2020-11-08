package ru.geekrains;

public class Plate {
    protected int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 200;
        System.out.println("+ 200 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}
