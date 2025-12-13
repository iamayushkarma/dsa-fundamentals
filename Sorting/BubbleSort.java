package Sorting;

import java.util.Arrays;

public class BubbleSort {

  static int[] swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    return arr;
  }

  static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean flag = false;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          flag = true;
        }
      }
      if (!flag)
        return;
    }
    System.out.print(Arrays.toString(arr));

  }

  public static void main(String[] args) {

    int[] arr = { 1, 4, 2, 3, 7, 9, 8 };
    bubbleSort(arr);
  }
}