//Задание № 5
package ru.geekbrains.lesson2;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {12, 523, 35, 3, 0, 16, 256, 361, 638, 73, 10};

        System.out.println("Заданный массив: " + Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());

    }


}
