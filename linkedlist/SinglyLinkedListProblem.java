package linkedlist;

public class SinglyLinkedListProblem {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Helper function
    static void printLinkedList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    static int findLength(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // > Q1
    // Finding Nth Node from the end of Linked List
    static Node getNthValue(Node head, int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // > Q2
    // Removing Nth Node from the end of Linked List

    static void removeNthNode(Node head, int idx) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }

    // > Q3
    // Finding intersection of two linked lists
    static Node findIntersection(Node Head1, Node Head2) {
        Node temp1 = Head1;
        Node temp2 = Head2;

        int m = findLength(Head1);
        int n = findLength(Head2);

        if (m > n) {

            for (int i = 0; i < m - n; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < n - m; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

    // > Q4
    // Finding middle element of a linked list

    static int findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    // > Q5
    // Deleting the middle element of the linked list
    static Node deleteMiddle(Node head) {
        if (head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next.next != null && fast.next.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // > Q6
    // Check is linked list is a cycle
    static boolean checkForCycle(Node head) {
        if (head.next == null)
            return false;
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            if (slow.next == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // > Q7
    // Check is linked list is a cycle, and if it is return that node.
    static Node findCycleNode(Node head) {
        Node slow = head;
        Node fast = head;

        if (fast == null || fast.next == null)
            return null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = head;

                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }

        }
        return null;
    }

    public static void main(String[] args) {

        Node a = new Node(6);
        Node b = new Node(16);
        Node c = new Node(60);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // > Q1
        Node temp = getNthValue(a, 3);
        System.out.println(temp.value);

        // > Q2
        System.out.println();
        removeNthNode(a, 3);
        printLinkedList(a);

        // > Q3
        Node u1 = new Node(4);
        Node v = new Node(5);

        u1.next = v;
        v.next = d;

        System.out.println();
        Node res = findIntersection(a, u1);
        if (res != null) {
            System.out.println("Intersecting point value: " + res.value);
        } else {
            System.out.println("No intersection found");
        }

        // > Q4
        System.out.println();
        System.out.println("Value of middle node is: " + findMiddle(a));

        // > Q5
        System.out.println();
        printLinkedList(a);
        System.out.println();
        deleteMiddle(a);
        printLinkedList(a);

        // > Q6
        Node p = new Node(6);
        Node q = new Node(16);
        Node r = new Node(60);
        Node s = new Node(5);
        Node t = new Node(12);
        Node u = new Node(8);

        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;
        t.next = u;
        u.next = r;
        System.out.println();
        System.out.println("Is linked list a cycle: " + checkForCycle(p));

        // > Q7
        System.out.println();
        Node ans = findCycleNode(p);
        System.out.println(ans.value);

    }

}
