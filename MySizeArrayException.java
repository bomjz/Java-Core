package ru.geekbrains;

class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размер массива некорректный!");
    }
}
