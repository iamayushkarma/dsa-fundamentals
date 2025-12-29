package linkedlist;

public class DoublyLinkedList {
    public static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    static Node printDoublyLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        return temp;
    }

    // Print list via random head
    static Node printViaRandomHaed(Node randomHead) {
        Node temp = randomHead;

        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {

        Node a = new Node(6);
        Node b = new Node(16);
        Node c = new Node(60);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(8);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = null;

        // Print Doubly Linked List
        System.out.println();
        printDoublyLinkedList(a);

        System.out.println();
        printViaRandomHaed(d);
    }
}
