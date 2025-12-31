package Stacks;

import java.util.Arrays;
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

    // > Q5
    // Balanced brackets
    // Check whether a given bracket sequence is balanced or not

    static boolean isBracketBalanced(String str) {
        Stack<Character> charStack = new Stack<>();
        int n = str.length();
        int size = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                charStack.push(ch);
                size++;
            } else { // ch == ')'
                if (charStack.isEmpty())
                    return false;
                if (charStack.peek() == '(') {
                    charStack.pop();
                    size--;
                }
            }
        }
        if (!charStack.isEmpty()) {
            System.out.println("You need to remove " + size + " brackets to balance this string");
        }
        return charStack.isEmpty();
    }

    // > Q6
    // Remove consecutive subsequences
    // Given a sequence of numbers. Remove all the consecutive subsequences of
    // length greater than or equal to 2 that contains the same element.

    static int[] removeConsecutiveSubsequences(int[] arr) {
        Stack<Integer> stc = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (stc.isEmpty() || stc.peek() != arr[i])
                stc.push(arr[i]);

            else if (stc.peek() == arr[i]) {
                if (i == n - 1 || arr[i] != arr[i + 1])
                    stc.pop();
            }
        }
        int[] resArr = new int[stc.size()];
        int l = resArr.length;

        for (int i = l - 1; i >= 0; i--) {
            resArr[i] = stc.pop();
        }
        return resArr;
    }

    // > Q7
    // Next greater element
    static int[] nextGraterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        int[] resArr = new int[arr.length];

        resArr[n - 1] = -1;
        stack.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty())
                resArr[i] = -1;
            else
                resArr[i] = stack.peek();
            stack.push(arr[i]);
        }
        return resArr;
    }

    // > Q8
    // Largest rectangle in Histogram
    // Given an array of integer heights representing the histogram's bar height
    // where the width of each bar is 1, return the area of the largest rectangle in
    // the histogram.

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
        System.out.println();
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

        // > Q5
        System.out.print("Ans Q5: ");
        String str5 = "()";
        // String str = "(()()(";
        // String str = "(((()))(()()(()))";
        // String str = "(()(()())((())()))";
        System.out.println("Is bracket string balanced: " + isBracketBalanced(str5));

        // >Q6
        System.out.println();
        System.out.print("Ans Q6: ");
        int[] arr6 = { 1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 6 };
        System.out.println(Arrays.toString(removeConsecutiveSubsequences(arr6)));

        // > Q7
        System.out.println();
        System.out.print("Ans Q7: ");
        int[] arr7 = { 4, 6, 3, 2, 8, 1, 9 };
        System.out.println(Arrays.toString(nextGraterElement(arr7)));

    }
}
