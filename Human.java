package ru.geekbrains.task2;

import java.util.Random;

public class Human implements Main.Distance, Main.Heigth {
    @Override
    public String getDistance() {
        Random rand = new Random();
        return "Человек пробежал " + rand.nextInt(1000) + " м.";
    }

    @Override
    public String getHeigth() {
        Random rand = new Random();
        return "Человек не сможет перепрыгнуть выше себя. Поэтому этот человек прыгнул " + rand.nextInt(2) + " м.";
    }
}
