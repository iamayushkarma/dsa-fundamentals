package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 3, 7, 9, 8 };

        insertionSort(arr);
    }
}
