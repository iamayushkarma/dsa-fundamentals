package Queues;

public class QueueUsingArray {

    public static class ArrayQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];

        // - add()
        public void add(int value) {
            if (rear == arr.length - 1) {
                System.out.println("Queue if full!");
                return;
            }
            // insert value to rear
            if (front == -1) {// for size 0
                front = rear = 0;
                arr[rear] = value;
            } else
                arr[++rear] = value;
            size++;
        }

        // - remove()
        public int remove() {
            if (size == 0) {
                System.out.println("Queue if empty!");
                return -1;
            }
            front++;
            size--;
            return arr[front - 1];
        }

        // - peek()
        public int peek() {
            if (size == 0) {
                System.out.println("Queue if empty!");
                return -1;
            }
            return arr[front];
        }

        // - isEmpty()
        public boolean isEmpty() {
            return size == 0;
        }

        // - print()
        public void printQueue() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.printQueue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.printQueue(); // 1 2 3 4 5

        q.remove();
        q.printQueue(); // 2 3 4 5

        System.out.println(q.peek()); // 2

    }
}
