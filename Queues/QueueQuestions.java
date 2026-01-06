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

    // > Q2
    // Print all elements in queue reversly without using print function
    static void printReverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.add(q.poll());
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            q.add(stack.pop());
        }
    }

    // > Q3
    // Reverse first k elements of a queue.
    static void reverseFirstKElements(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++)
            stack.add(q.poll());

        while (!stack.isEmpty())
            q.add(stack.pop());

        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.add(q.poll());
        }
        printQueue(q);
    }

    // > Q4
    // implement stacks using queue
    public static class stacksViaQueue {
        Queue<Integer> que = new LinkedList<>();

        public void push(int x) {
            que.add(x);
        }

        public int stacksViaQueuepop() {
            for (int i = 0; i < que.size() - 1; i++) {
                que.add(que.remove());
            }
            int x = que.remove();
            return x;
        }

        public int stacksViaQueuetop() {
            for (int i = 0; i < que.size() - 1; i++) {
                que.add(que.remove());
            }
            int x = que.remove();
            que.add(x);
            return x;
        }

        public boolean stacksViaQueueempty() {
            return que.size() == 0;
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

        // > Q1
        printQueue(q);
        System.out.println();

        // > Q2
        printReverseQueue(q);
        System.out.println();

        // > Q3
        reverseFirstKElements(q, 3);
        System.out.println();
    }
}
