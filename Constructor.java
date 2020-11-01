package ru.geekbrains;

public class Constructor {

    public static void main(String[] args) {
        Employee employee = new Employee("Пупкин Иван Иваныч", "Менеджер по уборке территории", "vanya@mail.ru", "+79005305351", 15000, 53);

        employee.toString();
        System.out.println(employee);


        //массив из сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Хрякин Дмитрий Иванович", "Чистильщик ушей", "sfdhjfg@jsdhs.bk", "+79068492783", 77000, 45);
        employees[1] = new Employee("Остроумов Валентин Сергеевич", "Переворачиватель пингвинов", "sjhcsv@mal.ru", "+79306739729", 97000, 34);
        employees[2] = new Employee("Беляков Максим Геннадиевич", "Согреватель кроватей", "bkcgsu@mail.ru", "+79006382819", 65000, 52);
        employees[3] = new Employee("Грустный Вадим Семёнович", "Клакер", "untbrs@yandex.ru", "+79154563298", 50000, 32);
        employees[4] = new Employee("Малахов Генрих Викторович", "Полицейский оливкового масла", "iusdfs@gmail.ru", "+74956382730", 367999, 37);



        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age >= 40) {
               employees[i].print();
            }
        }
    }
}
