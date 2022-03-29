package lesson9;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("РАЗМЕР МАССИВА БОЛЬШЕ, ЧЕМ 4 Х 4");
    }
}
