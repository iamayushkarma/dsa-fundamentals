package Sorting;

import java.util.Arrays;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int startIdx, int endIdx) {

        int pivot = arr[startIdx];
        int count = 0;

        for (int i = startIdx + 1; i <= endIdx; i++) {
            if (arr[i] < pivot)
                count++;
        }
        int pivotIdx = startIdx + count;

        swap(arr, startIdx, pivotIdx);

        int i = startIdx;
        int j = endIdx;

        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    static void quickSort(int[] arr, int startIdx, int endIdx) {

        if (startIdx >= endIdx)
            return;
        int pivotIdx = partition(arr, startIdx, endIdx);
        quickSort(arr, startIdx, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, endIdx);

    }

    public static void main(String[] args) {

        int[] arr = { 8, 4, 5, 2, 1 };
        System.out.println("Array before sort: " + Arrays.toString(arr));
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Array after sort: " + Arrays.toString(arr));
    }
}
