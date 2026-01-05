package Queues;

public class CircularQueueUsingArray {

    public static class CirculaArrayQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        // - add()
        public void add(int value) {
            if (size == arr.length) {
                System.out.println("Queue if full!");
                return;
            }
            // insert value to rear
            else if (size == 0) {// for size 0
                front = rear = 0;
                arr[rear] = value;
            } else if (rear < arr.length - 1) {
                arr[++rear] = value;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = value;
            }
            size++;
        }

        // - remove()
        public int remove() {
            if (size == 0) {
                System.out.println("Queue if empty!");
                return -1;
            } else {

                int val = arr[front];
                if (front == arr.length - 1)
                    front = 0;
                else
                    front++;
                size--;
                return val;
            }
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
                if (front <= rear) {
                    for (int i = front; i <= rear; i++) {
                        System.out.print(arr[i] + " ");
                    }
                } else {
                    for (int i = front; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    for (int i = 0; i <= rear; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CirculaArrayQueue q = new CirculaArrayQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.printQueue();

        q.remove();
        q.printQueue();

        System.out.println(q.peek()); // 2

        q.remove();
        q.remove();
        q.remove();
        q.printQueue();

        q.add(10);
        q.add(20);
        q.add(10);
        q.add(20);
        q.printQueue();

    }
}
