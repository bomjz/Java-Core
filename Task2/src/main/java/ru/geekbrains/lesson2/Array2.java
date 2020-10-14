//Задание № 2
package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int [] arr = new int[8];

        int j = 0;

        for (int i = 0; i<arr.length; i ++){
            arr[i] = j;
            j +=3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
