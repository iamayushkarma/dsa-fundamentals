package Stacks;

import java.util.Stack;

public class StackQuestions {

    // Q3 via recursion
    static void printStackRecursively(Stack<Integer> stc) {
        if (stc.isEmpty())
            return;
        int top = stc.pop();
        printStackRecursively(stc);
        System.out.print(top + " ");
        stc.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println();
        // > Q1
        // Copy contents of one stack to another in same order
        Stack<Integer> demoStack = new Stack<>();

        while (!stack.isEmpty()) {
            demoStack.push(stack.pop());
        }
        // System.out.println(demoStack); // [6, 5, 4, 3, 2, 1]

        Stack<Integer> copyOfStack = new Stack<>();
        while (!demoStack.isEmpty()) {
            copyOfStack.push(demoStack.pop());
        }
        System.out.print("Ans Q1: ");
        System.out.println(copyOfStack); // [1, 2, 3, 4, 5, 6]
        System.out.println();

        // > Q2
        // Insert at bottom / any index
        int idx = 0;
        int number = 0;
        Stack<Integer> stack2 = new Stack<>();
        while (copyOfStack.size() > idx) {
            stack2.push(copyOfStack.pop());
        }
        copyOfStack.push(number);
        while (!stack2.isEmpty()) {
            copyOfStack.push(stack2.pop());
        }
        System.out.print("Ans Q2: ");
        System.out.println(copyOfStack);
        System.out.println();

        // > Q3
        // Print stack
        System.out.print("Ans Q3: ");
        Stack<Integer> stack3 = new Stack<>();
        while (!copyOfStack.isEmpty()) {
            stack3.push(copyOfStack.pop());
        }
        while (!stack3.isEmpty()) {
            System.out.print(stack3.peek() + " ");
            copyOfStack.push(stack3.pop());
        }
        // via recursion
        System.out.println();
        System.err.print("Ans Q3 via recursion: ");
        printStackRecursively(copyOfStack);
        System.out.println();

        // > Q4
        // Remove from bottom / any index
        int idx2 = 2;
        Stack<Integer> stack4 = new Stack<>();
        for (int i = 0; i < idx2 - 1; i++) {
            stack4.push(copyOfStack.pop());
        }
        copyOfStack.pop();
        while (!stack4.isEmpty()) {
            copyOfStack.push(stack4.pop());
        }
        System.out.print("Ans Q4: ");
        System.out.println(copyOfStack);
        System.out.println();
    }
}
