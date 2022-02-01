package lesson3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5,2 )));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
