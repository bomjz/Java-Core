package ru.geekbrains.task2;

import java.util.Random;

public class Robot implements Main.Distance, Main.Heigth {



    public String getDistance() {
        Random rand = new Random();
        return "Робот пробежал " + rand.nextInt(10) + " м.";
    }


    public String getHeigth() {
        Random rand = new Random();
        return "К сожалению, человекоподобные роботы не умеют прыгать выше 1 метра. Поэтому этот робот прыгнул " + rand.nextInt(2) + " м.";
    }

}
