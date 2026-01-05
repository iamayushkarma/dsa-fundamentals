package Queues;

public class QueueUsingLinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static class LinkedListQueue {
        Node head = null;
        Node tail = null;
        int size = 0;

        // - .add()
        public void add(int value) {
            Node temp = new Node(value);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // - .peek()
        public int peek() {
            if (head == null) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return head.value;
        }

        // - .remove()
        public int remove() {
            if (head == null) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int x = head.value;
            head = head.next;
            size--;

            return x;
        }

        // - .print()
        public void print() {
            if (head == null) {
                System.out.println("Queue is empty.");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // - isEmpty()
        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        LinkedListQueue q = new LinkedListQueue();

        q.print();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.print(); // 1 2 3 4 5

        System.out.println(q.peek()); // 1

        q.remove();
        q.print(); // 2 3 4 5

    }
}
