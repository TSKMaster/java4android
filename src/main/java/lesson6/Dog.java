package lesson6;

public class Dog extends Animal{

    public static int dogCounter;

    public Dog(String name, String color) {
        super(name, color);
        dogCounter++;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= 500) {
            System.out.println("Собака " + this.name + " пробежала " + runDistance + " метров");
        } else {
            System.out.println("Собака " + this.name + " говорит:\"Я тебе не лошадь столько бегать\"");
        }
        System.out.println();
    }

    @Override
    public void swim(int swimDistance) {
        if(swimDistance <= 10) {
            System.out.println("Собака " + this.name + " проплыла " + swimDistance + " метров");
        } else {
            System.out.println("У собаки " + this.name + " не хватит сил проплыть такое расстояние");
        }
        System.out.println();
    }
}
