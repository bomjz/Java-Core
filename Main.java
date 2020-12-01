package ru.geekbrains.task2;

public class Main{
    public static void main(String[] args) {
        Distance disH = new Human();
        printDistance(disH);
        Heigth heiH = new Human();
        printHeigth(heiH);

        Distance disC = new Cat();
        printDistance(disC);
        Heigth heiC = new Cat();
        printHeigth(heiC);

        Distance disR = new Robot();
        printDistance(disR);
        Heigth heiR = new Robot();
        printHeigth(heiR);
    }


public static void printDistance(Distance distance) {
    System.out.println(distance.getDistance());
}

public static void printHeigth(Heigth heigth) {
    System.out.println(heigth.getHeigth());
}



interface Distance{
    String getDistance();
}

interface Heigth {
        String getHeigth();
}

}





