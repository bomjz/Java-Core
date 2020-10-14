//Задание № 8
package ru.geekbrains;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner jear = new Scanner(System.in);
        System.out.println("Введите год");
        int num = jear.nextInt();

        if (num % 400 == 0){
            System.out.println(num + " - Високосный год");
        }
        else if ((num % 4 == 0) && (num % 100 != 0)) {
            System.out.println(num + " - Високосный год");
        }
        else {
            System.out.println(num + " - Невисокосный год");
        }
    }
}