package ru.geekbrains;

import java.util.Arrays;

public class Main {
    protected static final int size = 10000000;
    protected static final int h = size / 2;

    public static void main(String[] args){
        Main App = new Main();
        App.methodOne();
        App.methodTwo();
    }

    private void methodOne(){
        System.out.println("Начало 1-го метода");
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Конец 1-го метода. Время работы %s", String.valueOf(end - start)));
    }

    private void methodTwo(){
        System.out.println("Начало 2-го метода");
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long split = System.currentTimeMillis();
        System.out.println(String.format("Конец 2-го метода. Время работы %s", String.valueOf(split - start)));

        Thread thread1 = new Thread(() ->this.methodTwoInternal(arr1, 1));
        Thread thread2 = new Thread(() ->this.methodTwoInternal(arr2, 2));

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println(String.format("Ошибка в потоках. %s", e.getMessage()));
        }


        long conn = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния склейки массива %s", String.valueOf(end - conn)));
        System.out.println(String.format("Завершение метода 2. Время выполнения %s", String.valueOf(end - start)));
    }

    private void methodTwoInternal(float[] arr, int number){
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния потока %d равно %s", number, String.valueOf(end - start)));
    }
}
