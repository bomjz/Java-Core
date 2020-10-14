//Задание № 6
package ru.geekbrains.lesson2;

public class Sum {
    public static boolean checkbalance(int[] arr){
        int lSum = 0;
        int rSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < i; j++) {
                lSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rSum += arr[j];
            }

            if (lSum == rSum){
                return true;
            }
        }
        return false;
    }

}