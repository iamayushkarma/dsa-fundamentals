package Queues;

import java.util.*;

//- First in First out (FIFO) / Last in Last out (LILO)
public class BasicOfQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // - Basic operations
        // 1. Add values to quque
        q.add(1);
        q.add(52);
        q.add(3);
        q.add(7);
        q.add(9);
        q.add(58);

        System.out.println(q); // [1, 52, 3, 7, 9, 58]

        // 2. remove topmost element .remove() / .poll()
        q.remove(); // first inserted element will removed first.
        System.out.println(q); // [52, 3, 7, 9, 58]
        q.poll(); // same as .remove()
        System.out.println(q); // [3, 7, 9, 58]

        // 3. Access topmost element .peek() / .element()
        System.out.println(q.element()); // 3
        System.out.println(q.peek()); // 3

        // - Auxiliary operations
        // 1. Size of queue .size
        System.out.println("Size of queue: " + q.size()); // 4
        // 2. isEmpty()
        System.out.println("Is queue empty: " + q.isEmpty()); // flase
    }
}
