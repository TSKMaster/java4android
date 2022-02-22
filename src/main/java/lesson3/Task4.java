package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        fillArray(arr);
        System.out.println();
        diagonals(arr);
    }

    private static void diagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array[i].length - 1 - i) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");


            }
            System.out.println();
        }
    }

    private static void fillArray(int[][] array) {
//        int n=1;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
