package lesson6;

public class Cat extends Animal{

    public static int catCounter = 0;
    public Cat(String name, String color) {
        super(name, color);
        catCounter++;
    }

    @Override
    public void run(int runDistance) {
        if ( runDistance <= 200) {
            System.out.println("Кот " + this.name + " пробежал " + runDistance + " метров");
        } else {
            System.out.println("Кот " + this.name + " говорит: \"Сам беги в такую даль\"");
        }
        System.out.println();
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Кот " + this.name + " наотрез отказывается лезть в воду");
        System.out.println();
    }




}
