//Задание № 5
package ru.geekbrains;

public class Position {
    public static void main(String[] args) {
    int s = number(60);
    }

    public static int number (int a) {
        if (a >= 0){
            System.out.println( a + " - это число положительное");
        } else {
            System.out.println(a + " это число отрицательное");
        }
        return a;
    }
}
