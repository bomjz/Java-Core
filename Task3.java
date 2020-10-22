package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int num = random.nextInt(10);
            System.out.println("Угдай число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите свой ответ:");
                int x = scanner.nextInt();
                if (x == num) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                }
                System.out.println(x < num ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? "У вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            System.out.println(num);
        }
        while (scanner.nextInt() == 1);
    }
}