package lesson9;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("В ячейке c адресом " + "[" + i + "]" + "[" + j + "] не содержится число");
    }
}