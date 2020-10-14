//Задание № 3
package ru.geekbrains;

public class Expression {
    public static void main(String[] args) {
        int s = summ(4, 15, 20, 10);
        System.out.println("a * (b + (c / d)) = " + s);

    }

    public static int summ(int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }
}
