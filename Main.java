package ru.geekbrains;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] fruit = {"Дыня", "Яблоко", "Груша", "Киви", "Гуава", "Личи", "Яблоко", "Манго", "Киви", "Ананас", "Лимон"};
        HashMap<String, Integer> select = new HashMap<>();
        for (String x : fruit) {
            select.put(x, select.getOrDefault(x,0)+1);
        }
        System.out.println(select);
    }
}



