package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        System.out.println(Arrays.toString(fillArray(arr)));

    }

    private static int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        return array;
    }
}
