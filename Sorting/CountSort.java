package Sorting;

import java.util.Arrays;

public class CountSort {

    static int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 4, 5, 4, 6, 7 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
