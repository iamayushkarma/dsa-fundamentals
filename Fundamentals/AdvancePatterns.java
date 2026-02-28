package Fundamentals;

public class AdvancePatterns {

    //> Q. 1 Butterfly Pattern
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *
    static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //> Q. 2 Solid Rhombus
    //     *****
    //    *****
    //   *****
    //  *****
    // *****;
    static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //> Q. 3 Number Pyramid
    //     1
    //    2 2
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5
    static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //> Q. 4 Palindromic Pattern
    //     1
    //    212
    //   32123
    //  4321234
    // 543212345
    static void palindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //> Diomand Pattern
    //    *
    //   ***
    //  *****
    // *******
    // *******
    //  *****
    //   ***
    //    *
    static void diomandPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //> Number Pattern
    // 1234567
    // 2345671
    // 3456712
    // 4567123
    // 5671234
    // 6712345
    // 7123456
    static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterflyPattern(5);
        solidRhombus(5);
        numberPyramid(5);
        palindromicPattern(5);
        diomandPattern(4);
        numberPattern(7);
    } // end of the function
}
