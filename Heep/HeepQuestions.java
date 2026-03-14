package Heep;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeepQuestions {

    // > Q1
    public static int findKthSmallestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int el : arr) {
            pq.add(el);
            if (pq.size() > k)
                pq.remove();
        }
        return pq.peek();
    }

    // > Q2
    public static int[] nearlySorted(int[] arr, int k) {
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int el : arr) {
            pq.add(el);
            if (pq.size() > k)
                arr[idx++] = pq.remove();
        }
        while (!pq.isEmpty())
            arr[idx++] = pq.remove();
        return arr;
    }

    // > Q3
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int minCost = 0;

        for (int el : arr) {
            pq.add(el);
        }
        while (pq.size() > 1) {
            int rop1 = pq.remove();
            int rop2 = pq.remove();
            int currentCost = rop1 + rop2;
            minCost += currentCost;
            pq.add(currentCost);
        }
        return minCost;
    }

    public static void main(String[] args) {
        // MinHeep by default
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // MaxHeep
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(-10);
        pq.add(55);
        pq.add(3);
        pq.add(11);
        System.out.println();

        // > Q1 Find kth smallest element in an array
        int[] arr1 = { 1, 2, 8, 9, 14, 21, 6, 33, 84, 51 };
        System.out.println("Q1 | Kth smallest el is: " + findKthSmallestElement(arr1, 3));

        // > Restore the sorted order of an array where every element is at most k
        // > positions away from its correct position.
        int[] arr2 = { 3, 1, 2, 6, 4, 5 };
        System.out.println("Q2 | Sorted array is: " + Arrays.toString(nearlySorted(arr2, 3)));

        // > Q3 Connect all ropes in an array into one rope with minimum total cost,
        // > where the cost of joining two ropes equals the sum of their lengths.
        int[] arr3 = { 2, 4, 3, 6 };
        System.out.println("Q3 | Minimum cost is: " + minCost(arr3));

    }
}
