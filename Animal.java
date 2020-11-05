package ru.geekbrains;


import java.util.Random;

abstract class Animals {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.name + " прыгнул " + dist + " m.");
        else System.out.println(this.name + " так далеко не бежит");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.name + " поплыл " + dist + " m.");
        else System.out.println(this.name + " так далеко не плавает.");
    }

    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.name + " прыгнул " + height + " m.");
        else System.out.println(this.name + " так прыгать пока не умеет.");
    }

    public void info() {
        System.out.println(this.name + " Run: " + this.maxRun + " m., пробежал: " + this.maxSwim + " m., Jump: " + this.maxJump + " m.");
    }
}
