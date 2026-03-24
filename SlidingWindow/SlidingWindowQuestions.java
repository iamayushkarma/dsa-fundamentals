package SlidingWindow;

import java.util.*;

public class SlidingWindowQuestions {

    // > Q1 First negative in every window of size k
    public static int[] firstNegInt(int[] arr, int k) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[n - k + 1];
        int idx = 0;

        // Calculating for first window
        while (idx < k) {
            if (arr[idx] < 0) {
                q.add(arr[idx]);
            }
            idx++;
        }
        res[0] = (q.isEmpty()) ? 0 : q.peek();
        for (int i = 1; i < n - k + 1; i++) {
            if (arr[i - 1] < 0) {
                q.poll();
            }
            if (arr[i + k - 1] < 0) {
                q.add(arr[i + k - 1]);
            }
            res[i] = (q.isEmpty()) ? 0 : q.peek();
        }
        return res;
    }

    // > Q2 Sort the array and check every window of size m; return the minimum
    // > difference between the first and last element of the window (arr[i+m-1] -
    // > arr[i]).
    public static int findMinDiff(int[] arr, int k) {
        int dif = 0;
        int maxDif = Integer.MAX_VALUE;
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n - k + 1; i++) {
            dif = arr[i + k - 1] - arr[i];
            maxDif = Math.min(dif, maxDif);
        }
        return maxDif;
    }

    // > Q3 Given a number x and an array of integers arr, find the smallest
    // > subarray with sum greater than the given value. If such a subarray do not
    // > exist return 0 in that case.
    public static int smallestSubWithSum(int[] arr, int target) {
        int ans = Integer.MAX_VALUE;
        int windowStarting = 0;
        int n = arr.length;
        int sum = 0;
        int length = 0;
        int i = 0;

        while (i < n) {
            sum += arr[i];
            if (sum > target) {
                length = i - windowStarting + 1;
                ans = Math.min(ans, length);
                while (windowStarting < i && sum > target) {
                    sum -= arr[windowStarting++];
                    if (sum < target) {
                        length = i - windowStarting + 1;
                        ans = Math.min(ans, length);
                    }
                }
            }
            i++;
        }

        // for (int i = 0; i < n; i++) {
        // if (sum <= target) {
        // sum += arr[i];
        // System.out.println("Sum " + sum);
        // if (sum > target) {
        // length = i - windowStarting + 1;
        // System.out.println("length " + length);
        // }
        // } else if (sum > target) {
        // sum -= arr[windowStarting];
        // windowStarting++;
        // }
        // System.out.println("Ans " + ans);
        // ans = Math.min(ans, length);
        // }
        return ans;

    }

    public static void main(String[] args) {
        // > Q1 First negative in every window of size k
        int[] arr1 = { -8, 2, 3, -6, 10 };
        int k = 2;
        System.out.println("Q1 | Array of First negative int is: " + Arrays.toString(firstNegInt(arr1, k)));

        // > Q2 Sort the array and check every window of size m; return the minimum
        // > difference between the first and last element of the window (arr[i+m-1] -
        // > arr[i]).
        int[] arr2 = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m = 5;
        System.out.println("Q3 | Minimum difference is: " + findMinDiff(arr2, m));

        // > Q3 Given a number x and an array of integers arr, find the smallest
        // > subarray with sum greater than the given value. If such a subarray do not
        // > exist return 0 in that case.
        int[] arr3 = { 1, 4, 45, 6, 0, 19 };
        int value3 = 51;
        System.out.println("Q3 | Sub array sum is : " + smallestSubWithSum(arr3, value3));
    }
}
