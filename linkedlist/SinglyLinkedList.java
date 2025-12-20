package linkedlist;

public class SinglyLinkedList {

    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;

        }
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void printLinkedListViaRecursion(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printLinkedListViaRecursion(head.next);
    }

    public static void main(String[] args) {

        Node x = new Node(5);
        System.out.println(x); // linkedlist.SinglyLinkedList$Node@251a69d7
        System.out.println(x.data); // 5
        System.out.println(x.next); // null

        Node a = new Node(5); // data: 5, next: null
        Node b = new Node(12);

        a.next = b; // 5 -> 12 78 47 16 33
        System.out.println(a.next);
        // a ka next will be address of 'b', which is somewhat
        // linkedlist.SinglyLinkedList$Node@7344699f

        System.out.println(b); // linkedlist.SinglyLinkedList$Node@7344699f
        System.out.println(a.next.data); // 12

        Node c = new Node(78);
        Node d = new Node(47);
        Node e = new Node(16);
        Node f = new Node(33);

        b.next = c; // 5 -> 12 -> 78 47 16 33
        c.next = d; // 5 -> 12 -> 78 -> 47 16 33
        d.next = e; // 5 -> 12 -> 78 -> 47 -> 16 33
        e.next = f; // 5 -> 12 -> 78 -> 47 -> 16 -> 33

        Node temp = a;
        // for (int i = 1; i <= 5; i++) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        System.out.println();
        System.out.print("Linked list printed via loop: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.print("Linked list printed via function: ");
        printLinkedList(a);
        System.out.println();

        System.out.print("Linked list printed via recursion: ");
        printLinkedListViaRecursion(a);
    }
}
