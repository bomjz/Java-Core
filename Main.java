package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");

        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

        System.out.println();

        cat1.run(1700);
        cat1.swim(5);
        cat1.jump(1.7);
    }
}
