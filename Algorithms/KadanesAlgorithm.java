package Algorithms;

public class KadanesAlgorithm {

    // 1. Start with the first number
    // 2. For each next number:
    // ..Add it to current sum
    // ..If current sum becomes negative or smaller than the number itself, start
    // fresh from this number
    // ..Update the maximum if current sum is larger
    // 3. Return the maximum

    static void printSunArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int value : arr) {
            currSum += value;
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0)
                currSum = 0;
        }
        System.out.print("Max sum is: " + maxSum);
    }

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        printSunArray(arr);
    }
}
