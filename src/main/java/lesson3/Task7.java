package lesson3;

public class Task7 {
    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkArray(arr));

    }

    private static boolean checkArray(int[] arr) {

        int sumleft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumleft += arr[i];
            int sumRight = 0;
            for (int j = arr.length - 1; j > i; j--) {
                sumRight += arr[j];
                System.out.println("Слева = " + sumleft);
                System.out.println("Справа = " + sumRight);
            }
            if (sumleft == sumRight) {
                return true;
            }

        }
        return false;
    }


}

