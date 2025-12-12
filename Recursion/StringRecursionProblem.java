package Recursion;

public class StringRecursionProblem {

    // > Q1 Remove all the occurrences of element from string.

    static String removeElement(String s, char x, int idx) {

        if (idx == s.length()) {
            return "";
        }
        String ans = removeElement(s, x, idx + 1);

        if (s.charAt(idx) != x)
            return s.charAt(idx) + ans;
        else
            return ans;

    }

    // > Q2 Write a program to print reverse of a string using recursion.

    static String reverseString(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String str = reverseString(s, idx + 1);
        return str + s.charAt(idx);
    }

    // > Q3 Write a program to check given string is palindrome or not.

    // static String checkPalindrome(String s) {
    // if (s.equals(reverseString(s, 0))) {
    // return "Yes its a palindrome";
    // } else {
    // return "Oh hell nah bro!";
    // }
    // }

    // Checking without using reverse
    static Boolean checkPalindrome(String s, int l, int r) {
        if (l >= r)
            return true;
        return (s.charAt(l) == s.charAt(r) && checkPalindrome(s, l + 1, r - 1));
    }

    public static void main(String[] args) {

        // > Q1
        String s = "aabtmt";
        char a = 'a';
        System.out.println(removeElement(s, a, 0));

        // > Q2
        String s1 = "abcde";
        System.out.println(reverseString(s1, 0));

        // > Q2
        // String s3 = "abcba";
        // System.out.println(checkPalindrome(s3));
        String s3 = "abcxa";
        int r = s3.length() - 1;
        System.out.println(checkPalindrome(s3, 0, r));
    }
}
