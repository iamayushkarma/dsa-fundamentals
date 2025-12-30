package Stacks;

public class StackUsingArray {
    public static class Stack {

        private int[] arr = new int[10];
        private int idx = 0;

        // .push()
        void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = value;
            idx++;
        }

        // .peek()
        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            System.out.println();
            return arr[idx - 1];
        }

        // .pop()
        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int value = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            System.out.println();
            return value;
        }

        // .display()
        void display() {
            System.out.print("Current stack: ");
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // .size()
        void size() {
            System.out.print("Size of stack: " + idx);
            System.out.println();
        }

        // .isEmpty
        boolean isEmpty() {
            return idx == 0;
        }

        // .isFull
        boolean isFull() {
            return idx == arr.length;
        }

        // .capacity
        int capacity() {
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println();
        System.out.print("Is stack empty: " + stack.isEmpty());
        stack.push(4);
        stack.push(3);
        stack.pop();
        stack.push(9);
        stack.push(8);
        stack.push(5);
        stack.display();
        stack.size();
        stack.push(14);
        System.out.print("Is stack full: " + stack.isFull());
        stack.push(16);
        System.out.println();
        System.out.println("Current capacity: " + stack.capacity());
    }
}
