package SlidingWindow;

public class BasicsOfSlidingWindow {

    public static int slidingWindow(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        int idx = 0;

        // Initial sum calculation for first window
        while (idx < k) {
            sum += arr[idx];
            idx++;
        }
        System.out.println("Sum after while loop: " + sum);
        for (int i = 1; i < n - k + 1; i++) {
            int prev = arr[i - 1];
            int next = arr[i + k - 1];
            sum = sum - prev + next;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 7, 8, 1, 2 };
        int k = 3;
        System.out.println("Maximum sub array sum is: " + slidingWindow(arr, k));

    }
}
