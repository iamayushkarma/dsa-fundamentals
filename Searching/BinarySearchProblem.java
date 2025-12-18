package Searching;

public class BinarySearchProblem {

    // > Q1
    // Find the first occurrence of a given element x, given that the given array is
    // sorted. If no occurrence of x is found then return -1.

    static int firstOccurance(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int f = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                f = mid;
                end = mid - 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return f;
    }

    // > Q2
    // Find the square root of the given non negative value x. Round it off to the
    // nearest floor integer value.
    static int sqrt(int x) {
        int start = 0, end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long val = mid * mid;
            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // > Q1
        int[] arr1 = { 1, 2, 2, 2, 3, 5, 5, 4, 8 };
        System.out.println("Target at index: " + firstOccurance(arr1, 2));

        // > Q2
        int x = 25;
        System.out.println(sqrt(x));
    }
}
