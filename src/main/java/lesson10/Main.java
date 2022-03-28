package lesson10;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> box1 = new FruitBox<>();
        box1.addFruit(new Apple(), 10);

        FruitBox<Orange> box2 = new FruitBox<>();
        box2.addFruit(new Orange(), 15);

        FruitBox<Apple> box3 = new FruitBox<>();
        box3.addFruit(new Apple(), 8);

        FruitBox<Apple> box4 = new FruitBox<>();
        box4.addFruit(new Apple(), 8);

        box1.printInfo();
        System.out.println("Вес коробки = " + box1.getWeight());
        box2.printInfo();
        System.out.println("Вес коробки = " + box2.getWeight());
        box3.printInfo();
        System.out.println("Вес коробки = " + box3.getWeight());
        box4.printInfo();
        System.out.println("Вес коробки = " + box4.getWeight());

        System.out.println(box1.compare(box2));
        System.out.println(box3.compare(box4));

        box1.transferTo(box3);
        System.out.println("Вес коробки = " + box3.getWeight());




    }



}
