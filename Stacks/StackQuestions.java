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

    static int largestRectangleHistogram(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        int[] nextSmallextElement = new int[n];
        int[] previousSmallextElement = new int[n];

        // claculate next smallest element
        stack.push(n - 1);
        nextSmallextElement[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty())
                nextSmallextElement[i] = n;
            else
                nextSmallextElement[i] = stack.peek();
            stack.push(i);
        }

        // empty stack
        while (!stack.isEmpty())
            stack.pop();

        // claculate previous smallest element
        stack.push(0);
        previousSmallextElement[0] = -1;
        for (int i = 1; i <= n - 1; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty())
                previousSmallextElement[i] = -1;
            else
                previousSmallextElement[i] = stack.peek();
            stack.push(i);
        }

        int maxArea = -1;

        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nextSmallextElement[i] - previousSmallextElement[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    // > Q9
    // Infix sum
    static int infixSum(String str) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascaii = (int) ch;

            if (ascaii >= 48 && ascaii <= 57)
                numberStack.push(ascaii - 48);
            else if (operatorStack.isEmpty() || ch == '(' || operatorStack.peek() == '(')
                operatorStack.push(ch);
            else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    int value2 = numberStack.pop();
                    int value1 = numberStack.pop();

                    char op = operatorStack.peek();

                    int result = switch (op) {
                        case '+' -> value1 + value2;
                        case '-' -> value1 - value2;
                        case '*' -> value1 * value2;
                        case '/' -> value1 / value2;
                        default -> throw new IllegalArgumentException("Invalid operator: " + op);
                    };
                    numberStack.push(result);
                    operatorStack.pop();
                }
                operatorStack.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    int value2 = numberStack.pop();
                    int value1 = numberStack.pop();

                    char op = operatorStack.peek();

                    int result = switch (op) {
                        case '+' -> value1 + value2;
                        case '-' -> value1 - value2;
                        case '*' -> value1 * value2;
                        case '/' -> value1 / value2;
                        default -> throw new IllegalArgumentException("Invalid operator: " + op);
                    };
                    numberStack.push(result);
                    operatorStack.pop();
                    // push
                    operatorStack.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
                        int value2 = numberStack.pop();
                        int value1 = numberStack.pop();
                        if (operatorStack.peek() == '*')
                            numberStack.push(value1 * value2);
                        else
                            numberStack.push(value1 / value2);
                        operatorStack.pop();
                        operatorStack.push(ch);
                    } else {
                        operatorStack.push(ch);
                    }
                }
            }
        }
        while (!operatorStack.isEmpty()) {
            int value2 = numberStack.pop();
            int value1 = numberStack.pop();

            char op = operatorStack.peek();

            int result = switch (op) {
                case '+' -> value1 + value2;
                case '-' -> value1 - value2;
                case '*' -> value1 * value2;
                case '/' -> value1 / value2;
                default -> throw new IllegalArgumentException("Invalid operator: " + op);
            };
            numberStack.push(result);
            operatorStack.pop();
        }
        return numberStack.peek();
    }

    // > Q10
    // Prefix calculation
    static String prefixSum(String str) {
        Stack<String> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascaii = (int) ch;

            if (ascaii >= 48 && ascaii <= 57) {
                String s = "" + ch;
                numberStack.push(s);
            } else if (operatorStack.isEmpty() || ch == '(' || operatorStack.peek() == '(')
                operatorStack.push(ch);
            else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    String value2 = numberStack.pop();
                    String value1 = numberStack.pop();
                    char op = operatorStack.pop();
                    String st = op + value1 + value2;
                    numberStack.push(st);
                }
                operatorStack.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String value2 = numberStack.pop();
                    String value1 = numberStack.pop();
                    char op = operatorStack.pop();
                    String st = op + value1 + value2;
                    numberStack.push(st);
                    // push
                    operatorStack.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
                        String value2 = numberStack.pop();
                        String value1 = numberStack.pop();
                        char op = operatorStack.pop();
                        String st = op + value1 + value2;
                        numberStack.push(st);
                        operatorStack.push(ch);
                    } else {
                        operatorStack.push(ch);
                    }
                }
            }
        }
        while (!operatorStack.isEmpty()) {
            String value2 = numberStack.pop();
            String value1 = numberStack.pop();
            char op = operatorStack.pop();
            String st = op + value1 + value2;
            numberStack.push(st);
        }
        String prefix = numberStack.pop();
        return prefix;
    }

    // > Q11
    // Prefix calculation
    static String postfixSum(String str) {
        Stack<String> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascaii = (int) ch;

            if (ascaii >= 48 && ascaii <= 57) {
                String s = "" + ch;
                numberStack.push(s);
            } else if (operatorStack.isEmpty() || ch == '(' || operatorStack.peek() == '(')
                operatorStack.push(ch);
            else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    String value2 = numberStack.pop();
                    String value1 = numberStack.pop();
                    char op = operatorStack.pop();
                    String st = value1 + value2 + op;
                    numberStack.push(st);
                }
                operatorStack.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String value2 = numberStack.pop();
                    String value1 = numberStack.pop();
                    char op = operatorStack.pop();
                    String st = value1 + value2 + op;
                    numberStack.push(st);
                    // push
                    operatorStack.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
                        String value2 = numberStack.pop();
                        String value1 = numberStack.pop();
                        char op = operatorStack.pop();
                        String st = value1 + value2 + op;
                        numberStack.push(st);
                        operatorStack.push(ch);
                    } else {
                        operatorStack.push(ch);
                    }
                }
            }
        }
        while (!operatorStack.isEmpty()) {
            String value2 = numberStack.pop();
            String value1 = numberStack.pop();
            char op = operatorStack.pop();
            String st = value1 + value2 + op;
            numberStack.push(st);
        }
        String postfix = numberStack.pop();
        return postfix;
    }

    // > Q12
    // Conversion of a Prefix expression to a Postfix expression
    static int postfixEvaluation(String str) {
        Stack<Integer> numberStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascaii = (int) ch;

            if (ascaii >= 48 && ascaii <= 57) {
                numberStack.push(ch - 48);
            } else {
                int value2 = numberStack.pop();
                int value1 = numberStack.pop();
                int result = switch (ch) {
                    case '+' -> value1 + value2;
                    case '-' -> value1 - value2;
                    case '*' -> value1 * value2;
                    case '/' -> value1 / value2;
                    default -> throw new IllegalArgumentException("Invalid operator: " + ch);
                };
                numberStack.push(result);
            }
        }
        return numberStack.peek();
    }

    static int prefixEvaluation(String str) {
        Stack<Integer> numberStack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascaii = (int) ch;

            if (ascaii >= 48 && ascaii <= 57) {
                numberStack.push(ch - 48);
            } else {
                int value1 = numberStack.pop();
                int value2 = numberStack.pop();
                int result = switch (ch) {
                    case '+' -> value1 + value2;
                    case '-' -> value1 - value2;
                    case '*' -> value1 * value2;
                    case '/' -> value1 / value2;
                    default -> throw new IllegalArgumentException("Invalid operator: " + ch);
                };
                numberStack.push(result);
            }
        }
        return numberStack.peek();
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

        // > Q8
        System.out.println();
        System.out.print("Ans Q8: ");
        int[] arr8 = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Max area of this histogram is: " + largestRectangleHistogram(arr8));

        // > Q9
        System.out.println();
        System.out.println("Ans Q9: ");
        String str9 = "9-(5+3)*4/6"; // infix a+b
        System.out.println("Ans for the string is: " + infixSum(str9));

        // > Q10
        System.out.println();
        System.out.println("Ans Q10: ");
        String str10 = "9-(5+3)*4/6"; // prefix +ab
        System.out.println("Ans for the string is: " + prefixSum(str10));

        // > Q11
        System.out.println();
        System.out.println("Ans Q11: ");
        String str11 = "9-(5+3)*4/6"; // postfix ab+
        System.out.println("Ans for the string is: " + postfixSum(str11));

        // > Q12
        System.out.println();
        System.out.println("Ans Q12: ");
        String str12 = "953+4*6/-";
        System.out.println("Ans for the string is: " + postfixEvaluation(str12));

        // > Q12
        System.out.println();
        System.out.println("Ans Q13: ");
        String str13 = "-9/*+5346";
        System.out.println("Ans for the string is: " + prefixEvaluation(str13));
    }
}
