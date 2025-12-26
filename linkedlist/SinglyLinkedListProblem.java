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

    // >
    // Q8 Merge linked list

    static Node mergeTwoSortedLists(Node l1, Node m2) {

        Node temp1 = l1;
        Node temp2 = m2;

        Node Head = new Node(-1);
        Node temp = Head;

        while (temp1 != null && temp2 != null) {

            // - With using extra space
            // if (temp1.value < temp2.value) {
            // temp.next = new Node(temp1.value);
            // temp1 = temp1.next;

            // } else if (temp1.value > temp2.value) {
            // temp.next = new Node(temp2.value);
            // temp2 = temp2.next;
            // } else {
            // temp.next = new Node(temp1.value);
            // temp1 = temp1.next;
            // }
            // temp = temp.next;

            // - Without using extra space
            if (temp1.value < temp2.value) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;

            } else if (temp1.value > temp2.value) {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            } else {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return Head.next;
    }

    // > Q9
    // Reverse Linked list
    static Node reverseLinkedList(Node head) {

        // - Without recursion
        Node prev = null;
        Node current = head;
        Node agla = null;

        while (current != null) {
            agla = current.next;
            current.next = prev;
            prev = current;
            current = agla;
        }
        return prev;

        // - With recursion
        // if (head == null || head.next == null)
        // return head;
        // Node newHead = reverseLinkedList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return newHead;
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
        f.next = null;

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

        // > Q8
        // Sorted list 1st
        // 2 → 6 → 11 → 19 → 28
        Node l1 = new Node(2);
        Node l2 = new Node(6);
        Node l3 = new Node(11);
        Node l4 = new Node(19);
        Node l5 = new Node(28);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        // Sorted list 2nd
        // 1 → 5 → 9 → 14 → 21 → 35
        Node m1 = new Node(1);
        Node m2 = new Node(5);
        Node m3 = new Node(9);
        Node m4 = new Node(14);
        Node m5 = new Node(21);
        Node m6 = new Node(35);

        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = m5;
        m5.next = m6;

        System.out.println();
        Node finalList = mergeTwoSortedLists(l1, m1);
        printLinkedList(finalList);

        // > Q9

        Node ll1 = new Node(1);
        Node ll2 = new Node(2);
        Node ll3 = new Node(3);
        Node ll4 = new Node(4);
        Node ll5 = new Node(5);
        Node ll6 = new Node(6);

        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;
        ll5.next = ll6;

        System.out.println();
        System.out.print("Original list: ");
        printLinkedList(ll1);
        System.out.println();
        Node revll = reverseLinkedList(ll1);
        System.out.print("Reversed list: ");
        printLinkedList(revll);

    }

}
