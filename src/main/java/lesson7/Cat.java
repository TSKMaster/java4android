package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {

    private String name;

    private final int MIN_HUNGRY = 100;
    private int nowHungry;


    public Cat(String name, int nowHungry) {
        this.nowHungry = nowHungry;
        this.name = name;
    }

    public void eat(Plate plate) {

        if(plate.getFoodCount() > (MIN_HUNGRY - nowHungry)) {
            plate.decreaseFood(MIN_HUNGRY - nowHungry);
            System.out.printf("\nСытость кота %s сейчас равна %d из %d", this.name, nowHungry, MIN_HUNGRY);
            System.out.printf("\nКот %s съел %d еды и полностью сыт\n", this.name, (MIN_HUNGRY - nowHungry));
            plate.printInfo();

        } else {
            int a = plate.getFoodCount();
            System.out.printf("\nСытость кота %s сейчас равна %d из %d\n", this.name, nowHungry, MIN_HUNGRY);
            nowHungry += a;
            plate.decreaseFood(plate.getFoodCount());
            System.out.printf("Кот %s съел %d еды \n", this.name, a);
            System.out.printf("Сытость кота %s сейчас равна %d из %d\n", this.name, nowHungry, MIN_HUNGRY);
            plate.printInfo();
            System.out.printf("Коту %s не хватило %d еды", this.name, (MIN_HUNGRY - nowHungry));
        }

    }



    public int getMIN_HUNGRY() {
        return MIN_HUNGRY;
    }
}
