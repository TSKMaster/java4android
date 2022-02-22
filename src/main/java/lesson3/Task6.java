package lesson3;

import java.util.Arrays;
import java.util.Random;

import static lesson3.Task1.fillArray;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        System.out.println(Arrays.toString(fillArray(arr)));
        findMaxMin(arr);
    }

    private static int[] fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2,15);
        }
        return array;

    }

    private static void findMaxMin(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        int min = max;
        for (int i = 0; i < array.length ; i++) {
           if (array[i] < min){
            min = array[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
