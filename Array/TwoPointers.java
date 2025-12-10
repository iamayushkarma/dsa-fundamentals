package Array;

import java.math.*;

public class TwoPointers {

    //> Helper function
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int arr[], int value1, int value2) {
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }

    static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            swap(arr, i, n - 1 - i);
        }
    }

    //> Q 1 Swap zeros and ones
    static void sortZerosAndOnes(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    //> Q 2 sort all even numbers on start and ood at end

    static void sortEevenAndOdds(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    //> 3 Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decresing order
    static int[] sortIncresing(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int ans[] = new int[n];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //> Q 1
        // int arr[] = {0,1,0,1,0,0,1,1,0,0};
        // sortZerosAndOnes(arr);
        // printArr(arr);

        //> Q 2
        // int arr_2[] = {5,2,3,7,8,9,6,4};
        // sortEevenAndOdds(arr_2);
        // printArr(arr_2);

        //> Q 3
        int arr_3[] = { -10, -7, -1, 2, 6, 8, 11 };
        int ans[] = sortIncresing(arr_3);
        reverse(ans);
        printArr(ans);
        // printArr(arr_2);
    }
}
