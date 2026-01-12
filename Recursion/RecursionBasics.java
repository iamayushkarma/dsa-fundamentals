package Recursion;

public class RecursionBasics {
    static void printNumbers(int a) {
        if (a == 1) {
            System.out.print(a + " ");
            return;
        }
        printNumbers(a - 1);
        System.out.print(a + " ");
    }

    static void printDecresing(int b) {
        if (b == 1) {
            System.out.print(b + " ");
            return;
        }
        System.out.print(b + " ");
        printDecresing(b - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        printNumbers(a);
        System.out.println();
        int b = 5;
        printDecresing(b);
    }
}