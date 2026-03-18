package BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {

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
    }
}
