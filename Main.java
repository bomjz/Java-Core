package ru.geekrains;

public class Main {
    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("2Pac", 100, 4);
        cat[1] = new Cat("Barsik", 60, 5);
        cat[2] = new Cat("Uasya", 45, 2);
        Plate plate = new Plate(500);

        do {
            for (Cat i : cat) {
                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println(i.getName() + " уничтожил " + i.getAppetite() + " грамм корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nВы покормили кота  " + TIME + " час(ов) назад. В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 12);
        System.out.println("Коты обожрались и легли спать!");
    }
}
