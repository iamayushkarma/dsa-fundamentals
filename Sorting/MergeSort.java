package Sorting;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1; // length of left array
        int n2 = r - mid; // length of right array

        // creating two sub left and right array
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;

        // copy values to left
        for (i = 0; i < n1; i++)
            left[i] = arr[l + i];
        // copy values to right
        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }

    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 5, 2, 1 };
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Sorted array: ");
        int n = arr.length - 1;
        mergeSort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}