package Sorting;

import java.util.Arrays;

public class SortingProblem {

    // > Helper function
    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    // > Q1
    // Given an integer array arr, move all 0's to the end of it while maintaining
    // the relative order of the non-zero elements.

    // bubble sort
    static void q1ViaBubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag)
                return;
        }
        System.out.println(Arrays.toString(arr));

    }

    // > Q2
    // Give an array of names of the fruits; you are supposed to sort it in
    // lexicographical order using the selection sort

    static void sortInLexicographi(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minumIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minumIndex]) < 0) {
                    minumIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minumIndex];
            arr[minumIndex] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    // > Q3
    // Given an array where all its elements are sorted in increasing order except
    // two swapped elements, sort it in linear time. Assume there are no duplicates
    // in the array.

    static void swortArr(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) { // first conflict
                    x = i - 1;
                    y = i;
                } else {// second conflict
                    y = i;
                }
            }
        }

        swap(arr, x, y);

        System.out.println(Arrays.toString(arr));

    }

    // > Q4
    // Given an array of positive and negative integers, segregate them in linear
    // time and constant space. The output should print all negative numbers,
    // followed by all positive numbers.
    static void partition(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] < 0)
                l++;
            while (arr[r] >= 0)
                r--;
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // > Q5
    // Given an array of size N containing only Os, Is, and 2s; sort the array in
    // ascending order.

    static void sort012(int[] a) {
        int lo = 0, mid = 0, hi = a.length - 1;
        // explore the unknown region
        while (mid <= hi) {
            if (a[mid] == 0) {
                swap(a, mid, lo);
                mid++;
                lo++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, hi);
                hi--;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        // > Q1
        int[] arr1 = { 5, 0, 8, 6, 0, 0, 1, 2 };
        q1ViaBubbleSort(arr1);

        // > Q2
        String[] arr2 = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        sortInLexicographi(arr2);

        // > Q3
        int[] arr3 = { 10, 5, 6, 7, 8, 9, 3 };
        swortArr(arr3);

        // > Q4
        int[] arr4 = { -13, 20, 7, 0, -13, 11, -13 };
        partition(arr4);

        // > 5
        int[] arr5 = { 2, 2, 0, 0, 1, 1, 2, 0, 1, 0 };
        sort012(arr5);

    }
}
