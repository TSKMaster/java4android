package lesson3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int n = -2;
        System.out.println(Arrays.toString(arrShift(arr, n)));
    }

    private static int[] arrShift(int[] arr, int n) {

        if (n > 0) {
            for (int i = 0; i < n; n++) {
                int buffer = arr[0];
                arr[0] = arr[arr.length - 1];


                for (int j = 1; j < arr.length - 1; j++) {
                    arr[arr.length - j] = arr[arr.length - j - 1];
                }
                arr[1] = buffer;
            }
        }
        else if (n < 0) {
            for (int i = 0; i > n; i--) {
                int buffer = arr[arr.length - 1];
                arr[arr.length - 1] = arr[0];

                for (int j = 1; j < arr.length - 1; j++) {
                    arr[j - 1] = arr[j];
                }

                arr[arr.length - 2] = buffer;
            }
        }
        return arr;
    }
}

