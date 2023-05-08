package org.example;
import java.util.Arrays;
public class z2 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 6, 7, 9, 5};
        // int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(arr));

        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Последовательность является  возрастающей");
        } else {
            System.out.println("Последовательность не является  возрастающей");
        }
    }
}

/**
 * Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */
