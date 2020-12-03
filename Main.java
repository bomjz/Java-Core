package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        int result = 0;

        String[][] array = {{"12","12","12","12"},{"12","12","12","12"}};
        String[][] error_array = {{"1","2","3","4","5"},{"1","2","3","4"}};
        String[][] error_data = {{"1","1","3","4",},{"1","2","2Pac3","4"}};

        System.out.println("Task №1:");

        try {
            result = 0;
            result = analyze(array);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Mission completed");
            System.out.println("_________________________");
        }

        System.out.println("Task №2:");
        try {
            result = 0;
            result = analyze(error_array);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна "+String.valueOf(result));
            System.out.println("_________________________");
        }

        System.out.println("Task №3:");
        try {
            result = 0;
            result = analyze(error_data);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна "+String.valueOf(result));
            System.out.println("_________________________");
        }

    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        int value = 0;
        int row = 0;
        int cell = 0;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=1;i<3;i++){
            row = i;
            for(int c=1;c<5;c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    sum += value;
                } catch (IllegalArgumentException e){
                    String message = "в "+String.valueOf(row)+" ряду, "+String.valueOf(cell)+" ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return sum;
    }
}
