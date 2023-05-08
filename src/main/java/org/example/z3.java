package org.example;

import java.util.Arrays;
public class z3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int SumInd2Zn = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < -9 || arr[i] > 9) {
                SumInd2Zn = SumInd2Zn + i;
            }
        }
        //System.out.println(SumInd2Zn);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = SumInd2Zn;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

/**
 * Дан массив целых чисел.
 * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */