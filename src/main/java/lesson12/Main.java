package lesson12;

import java.util.Arrays;

public class Main {
    static final int SIZE = 1000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {

        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        method1(arr);
        method2(arr, HALF);

    }

    private static void method1(float[] arr) {
        long start = System.currentTimeMillis();
        formula(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения " + (finish - start) + " мс");
        //  System.out.println(Arrays.toString(arr));
    }

    private static void method2(float[] arr, int HALF) throws InterruptedException {
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread t1 = new Thread(() -> {
            formula(arr1);
        });
        Thread t2 = new Thread(() -> {
            formula(arr2);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);


        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения " + (finish - start) + " мс");

        //System.out.println(Arrays.toString(arr));

    }


    private static void formula(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));

        }
        //    System.out.println(Arrays.toString(arr));
    }
}
