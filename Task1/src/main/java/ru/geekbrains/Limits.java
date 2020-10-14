//Задание № 4
package ru.geekbrains;

public class Limits {
    public static void main(String[] args) {
        int s = limits(15, 10);
    }

    public static int limits(int a, int b) {
        int sum = a + b;
        if (sum > 9 && sum < 21) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return sum;
    }
}
