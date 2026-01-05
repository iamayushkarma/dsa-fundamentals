package Queues;

import java.util.*;

public class QueueQuestions {

    // > Q1
    // Print all elements in queue without using print function
    static void printQueue(Queue<Integer> q) {
        Queue<Integer> helper = new ArrayDeque<>();

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        while (!helper.isEmpty()) {
            q.add(helper.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        printQueue(q);
    }
}
