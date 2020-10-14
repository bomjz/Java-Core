//Задание № 1
package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Начальный массив: " + Arrays.toString(arr));


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(arr));
    }
}
