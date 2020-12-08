package ru.geekbrains;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    public static void main(String[] args) {
        Phonebook book = new Phonebook();
        book.addContact("Борис", "+79321133243");
        book.addContact("Женя", "+79217439201");
        book.addContact("Колян", "+79333727281");
        book.addContact("Гергий", "+79216374722");
        book.addContact("Филипп", "+76267239717");
        book.addContact("Ваня", "+79005272738");

        book.findAndPrint("Женя");
        book.findAndPrint("Филипп");
        book.findAndPrint("Колян");
    }

    HashMap<String, HashSet<String>> pb;

    public void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("Имя контакта" + name + " / номер телефона" + pb.getOrDefault(name, new HashSet<>()));
    }
}
