package Stacks;

public class StackUsingLinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static class Stack {
        Node head = null;
        private int size = 0;

        void push(int value) {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.value;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.value;
        }

        void displayRecursive(Node head) {
            if (head == null)
                return;
            displayRecursive(head.next);
            System.out.print(head.value + " ");
        }

        void display() {
            System.out.println();
            displayRecursive(head);
            System.out.println();
        }

        void displayReverse() {
            System.out.println();
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() { // getter
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println();
        System.out.print("Is stack empty: " + stack.isEmpty());
        stack.push(4);
        stack.push(3);
        stack.push(9);
        stack.push(8);
        stack.push(5);
        stack.push(14);
        stack.push(16);
        stack.display();
        System.out.println();
    }
}
