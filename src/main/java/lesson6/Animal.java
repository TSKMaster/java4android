package lesson6;

public abstract class Animal {
    String name;
    String color;
    public static int animalCounter;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        animalCounter++;
    }

    public abstract void run(int RunDistance);

    public abstract void swim(int swimDistance);

}
