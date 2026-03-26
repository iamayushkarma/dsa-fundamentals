package SlidingWindow;

public class BasicsOfSlidingWindow {

    public static int slidingWindow(int[] arr, int k) {
        int n = arr.length; // total size of array
        int sum = 0; // current window sum
        int maxSum = 0; // maximum sum found
        int idx = 0;

        // Step 1: calculate sum of first window (first k elements)
        while (idx < k) {
            sum += arr[idx];
            idx++;
        }

        // print first window sum (just for checking)
        System.out.println("Sum after while loop: " + sum);

        // Step 2: slide the window
        // i is the starting index of window
        for (int i = 1; i < n - k + 1; i++) {

            int prev = arr[i - 1]; // element going out of window
            int next = arr[i + k - 1]; // new element coming into window

            // update sum: remove old element and add new one
            sum = sum - prev + next;

            // update max sum if current sum is greater
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum; // return the maximum sum found
    }

    public static void main(String[] args) {

        int[] arr = { 4, 2, 1, 7, 8, 1, 3 }; // sample array
        int k = 3; // window size

        // call function and print result
        System.out.println("Maximum sub array sum is: " + slidingWindow(arr, k));
    }
}