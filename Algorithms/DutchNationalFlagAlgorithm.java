package Algorithms;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {

    static void swap(int[] arr, int val1, int val2) {
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }

    static void DNF(int[] nums) {
        int n = nums.length;
        int mid = 0, low = 0;
        int high = n - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    swap(nums, mid, low);
                    low++;
                    mid++;
                    break;
                }
                case 1 -> {
                    mid++;
                    break;
                }
                case 2 -> {
                    swap(nums, mid, high);
                    high--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 1, 2, 0, 1, 0 };
        DNF(nums);
    }
}
