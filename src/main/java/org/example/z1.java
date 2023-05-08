package org.example;

public class z1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            if (isSimple(arr[i])) {
                sum = sum + arr[i];
                /* System.out.print(arr[i] + " "); // => 2 3 5 7 11 */

            }

            //System.out.print(sum + " ");
        }
        System.out.printf("Cуммa простых чисел последовательности: %d ", sum);
    }

    public static boolean isSimple(int num) {
        if (num < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                return false;
            }
        }
        return true;
    }
}


/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */