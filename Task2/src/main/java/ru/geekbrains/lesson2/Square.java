//Задание № 4
package ru.geekbrains.lesson2;

public class Square {
    public static void main(String[] args) {
        int counter = 1;
        int a = 0;
        int b = 0;
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = counter;
                counter+=3;
                if (i == a && j == b){
                    arr[i][j] = 1;
                    a ++;
                    b++;
                }
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}


