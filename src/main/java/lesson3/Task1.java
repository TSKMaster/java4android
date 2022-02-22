package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = new int[15];
        System.out.println(Arrays.toString(fillArray(arr)));
        System.out.println(Arrays.toString(changeArray(arr)));


    }

     public static int[] fillArray(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
        }
        return array;
    }

    private static int[] changeArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
        return array;
    }
}
