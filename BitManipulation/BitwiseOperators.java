package BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {

        // - Bitwise Operator
        // Bitwise AND (&)
        // Compares each bit of both numbers
        // Result bit is 1 only if BOTH bits are 1, otherwise 0
        // Used for masking (checking specific bits)
        System.out.println(51 & 42); // 34

        // Bitwise OR (|)
        // Compares each bit of both numbers
        // Result bit is 1 if ANY one of the bits is 1
        // Used to set bits
        System.out.println(51 | 42); // 59

        // Bitwise XOR (^)
        // Compares each bit of both numbers
        // Result bit is 1 if bits are DIFFERENT, 0 if same
        // Used in swapping, finding unique elements
        System.out.println(51 ^ 42); // 25

        // - 1's and 2's Complement
        // 1's Complement (~)
        // Flips all bits of the number (0 → 1, 1 → 0)
        // In Java, result = -(n + 1)
        // Used for bit manipulation and forming 2's complement
        System.out.println(~5); // -6

        // 2's Complement
        // 2's complement = 1's complement + 1
        // Used to represent negative numbers in binary
        // In Java, negative numbers are stored in 2's complement form
        int n = 5;
        int twosComp = ~n + 1;
        System.out.println(twosComp); // -5
    }
}
