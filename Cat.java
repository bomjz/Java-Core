package ru.geekrains;

public class Cat {
    protected String name;
    protected int appetite;
    protected int satietyTime;
    protected int satiety;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

//    int getSatietyTime() {
//        return satietyTime;
//    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += satietyTime;
    }
}
