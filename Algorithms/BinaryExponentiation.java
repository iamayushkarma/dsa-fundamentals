package Algorithms;

public class BinaryExponentiation {
    static int BinaryExponentiat(int num, int n) {
        int ans = 1;
        int binary_form = n;
        if (binary_form < 0) {
            num = 1 / num;
            binary_form = -binary_form;
        }
        while (binary_form > 0) {
            if (binary_form % 2 == 1) {
                ans *= num;
            }
            num *= num;
            binary_form /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 4, n = 5;
        System.out.println(BinaryExponentiat(num, n));
    }
}
