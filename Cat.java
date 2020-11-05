package ru.geekbrains;

class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.maxJump = 2.0;
        this.maxRun = random.nextInt(45) + 155;
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не плавают!");
    }
}
