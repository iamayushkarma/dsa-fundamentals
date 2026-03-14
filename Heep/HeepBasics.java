package Heep;

import java.util.*;

public class HeepBasics {

    // - Insertion on element O(logn)
    // - Removal of min element O(logn)
    // - Get min element O(1)

    public static void main(String[] args) {
        // MinHeep by default
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(-10);
        pq.add(55);
        pq.add(3);
        pq.add(11);

        System.out.println(pq.peek()); // smallest el (-10) | O(1)
        System.out.println(pq);
    }
}
