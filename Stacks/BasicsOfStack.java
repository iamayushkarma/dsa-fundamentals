package Stacks;

import java.util.Stack;

public class BasicsOfStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Time complexity of push, pop, and peek is big O(1);
        // - push to add elements. LIFO (Last in first out)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        /*
         * | 6 |
         * | 5 |
         * | 4 |
         * | 3 |
         * | 2 |
         * | 1 |
         */

        // - peek
        System.out.println(stack.peek()); // 6

        // Print whole stack via build-in function
        System.out.println(stack); // [1, 2, 3, 4, 5, 6]

        // - pop (removes top most element)
        stack.pop();
        System.out.println(stack); // [1, 2, 3, 4, 5]

        // size, to get stack size
        System.out.println("Size of stack is: " + stack.size()); // 5
    }
}
