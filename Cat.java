package ru.geekbrains.task2;

import java.util.Random;

public class Cat implements Main.Distance, Main.Heigth {
    @Override
    public String getDistance() {
        Random rand = new Random();
        return "Кот пробежал " + rand.nextInt(10) + " м.";
    }

    @Override
    public String getHeigth() {
        Random rand = new Random();
        return "Коты ленивы. Поэтому этот кот прыгнул " + rand.nextInt(2) + " м.";
    }
}
