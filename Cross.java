package Lessen4;

import java.util.Random;
import java.util.Scanner;

public class Cross {
    public static final int SIZE = 3;

    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
        print(field);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            //ход пользователя
            System.out.println("Введи куда бить! Например, 1 2");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
                System.out.println("Координаты за пределами поля!");
                continue;
            }
            if (field[x][y] != EMPTY) {
                System.out.println("Нельзя туда бить! Там уже " + field[x][y]);
                continue;
            }
            field[x][y] = CROSS;
            System.out.println("\nВаш ход:");
            print(field);
            if (isWin(field, CROSS)) {
                System.out.println("Победили крестики!");
                break;
            } else if (!hasEmptyCells(field)) {
                System.out.println("Ничья!");
                break;
            }

            //ход компьютера
            while (true) {
                int cx = random.nextInt(SIZE);
                int cy = random.nextInt(SIZE);
                if (field[cx][cy] != EMPTY) {
                    continue;
                }
                field[cx][cy] = ZERO;
                break;
            }
            System.out.println("\nПоходил компьютер:");
            print(field);
            if (isWin(field, ZERO)) {
                System.out.println("Победили нолики!");
                break;
            } else if (!hasEmptyCells(field)) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static boolean hasEmptyCells(char[][] field) {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == EMPTY)
                    return true;
            }
        }
        return false;
    }

    public static boolean isWin(char field[][], char player) {//проверка на победу 2.0
        for (int i = 0; i < 3; i++)
            if ((field[i][0] == player && field[i][1] == player &&
                    field[i][2] == player) ||
                    (field[0][i] == player && field[1][i] == player &&
                            field[2][i] == player))
                return true;
        if ((field[0][0] == player && field[1][1] == player && field[2][2] == player) ||
                (field[2][0] == player && field[1][1] == player &&
                        field[0][2] == player))
            return true;
        return false;
    }

    public static void print(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}