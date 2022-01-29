package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(diapasonTest(15, 3));
        System.out.println(positiveCheck(-15));
        System.out.println(negativeCheck(10));
        print(5, "I ❤ Java");
        System.out.println(yearCheck(1998));
    }

    static boolean diapasonTest(int a, int b) {

        return (a + b >= 10 && a + b <= 20);

    }

    static String positiveCheck(int a) {
        if (a >= 0) {
            return "Число положительное";
        } else return "Число отрицательное";
    }

    static boolean negativeCheck(int a) {
        return (a < 0);

    }

    static void print(int printCount, String message) {
        for (int i = 0; i < printCount; i++) {
            System.out.println(message);
        }
    }

    static boolean yearCheck(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else return false;
    }
}
