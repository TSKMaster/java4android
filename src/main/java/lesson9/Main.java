package lesson9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[4][5];
        fillArray(array);
        System.out.println(Arrays.deepToString(array));
        massiveExceptions(array);
    }

    private static String[][] fillArray(String[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(random.nextInt(5));
            }
        }
        array[2][2] = "a";
        return array;
    }

    private static void massiveExceptions(String[][] array) {

       int arrSum = 0;
        try {
            if (array.length > 4 || array[1].length > 4) {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(arrSum);
    }

}
