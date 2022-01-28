package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        printThreeWords2();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    public static void printThreeWords2() {
        System.out.println("Orange"
                + System.lineSeparator() + "Banana"
                + System.lineSeparator() + "Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 15;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");

    }
}
