package ru.geekbrains;

public class Employee {

    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

    public String fullName;
    public String position;
    public String email;
    public String number;
    public int salary;
    public int age;

    public Employee(String fullName, String position, String email, String number, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }


    //Метод для вывода в консоль
    public String toString() {
        return "ФИО: " + fullName + '\n' + "Должность: " + position + '\n' + "E-mail: " + email + '\n' + "Телефон: " + number + '\n' + "ЗП: " + salary + '\n' + "Возраст: " + age;
    }

    //Метод вывода для последнего задания
    public void print(){
        System.out.println(this);
    }
}
