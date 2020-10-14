//Задание № 6
package ru.geekbrains;

public class Negative {
    public static void main(String[] args) {
        int num = number(-45);
    }

   public static int number(int a) {
       boolean bool;
       if (a < 0) {
           bool = true;
       } else {
           bool = false;
       }
       System.out.println(bool);
       return a;
   }

}
