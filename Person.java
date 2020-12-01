package ru.geekbrains.task1;

public class Person implements Main.Run, Main.Jump {
    public Person() {
        super();
    }

    public String getRun() {
        return "Человек бежит";
    }

    @Override
    public String getJump() {
        return "Человек прыгает";
    }
}
