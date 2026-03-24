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
    }
}
