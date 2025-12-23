package linkedlist;

public class SinglyLinkedList {

    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        static Node head = null;
        static Node tail = null;

        void displayNode() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        static int findLength() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        static void insertAtEnd(int value) {
            Node temp = new Node(value);

            if (head == null || tail == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        static void insertAtStart(int value) {
            Node temp = new Node(value);
            if (head == null || tail == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        static void insert(int value, int idx) {
            Node t = new Node(value);
            Node temp = head;

            if (idx < 0 || idx > findLength()) {
                System.out.println("Index is larger than linked list length");
                return;
            }
            if (idx == 0) {
                insertAtStart(value);
                return;
            }
            if (idx == findLength()) {
                insertAtEnd(value);
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getValue(int idx) {
            Node temp = head;
            if (idx < 0 || idx >= findLength()) {
                System.out.println("Invalid index");
                return -1;
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
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

    static int findLength(Node node) {

        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
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

        System.out.println();
        System.out.println("Length of Linked list is: " + findLength(a));

        System.out.println();
        linkedList newList = new linkedList();
        newList.insertAtEnd(0);
        newList.insertAtEnd(5);
        newList.insertAtEnd(8);
        newList.displayNode();
        System.out.println();
        // System.out.println("Length of linked list is: " + newList.findLength());
        newList.insertAtStart(6);
        newList.displayNode();
        System.out.println();
        newList.insert(9, 4);
        newList.displayNode();
        System.out.println();
        int index = -2;
        System.out.println("Value at index " + index + " is: " + newList.getValue(index));
    }
}
