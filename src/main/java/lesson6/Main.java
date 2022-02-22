package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Серый");
        Cat cat2 = new Cat("Бегемот", "Черный");

        Dog dog1 = new Dog("Барбос", "Пятнистый");
        Dog dog2 = new Dog("Мухтар", "Коричневый");

        cat1.run(150);
        cat1.swim(100);

        cat2.run(300);
        cat2.swim(50);

        dog1.run(200);
        dog1.swim(250);

        dog1.run(1000);
        dog1.swim(8);

        System.out.println("Всего животных - " + Animal.animalCounter + "\nИз них котов - "
                            + Cat.catCounter + ", а собак - " + Dog.dogCounter);
    }





}
