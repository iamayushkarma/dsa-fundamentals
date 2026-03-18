package BitManipulation;

public class BitManipulationQuestions {

    // > Q1 Find single number
    public static int findSingle(int[] arr) {
        int xor = 0;
        for (int el : arr) {
            xor ^= el;
        }
        return xor;
    }

    // > Q2 Swap two values using XOR
    public static int[] swapUsingXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[] { a, b };
    }

    public static void main(String[] args) {

        // > Q1 Find single number
        int[] arr1 = { 1, 2, 1, 3, 5, 4, 3, 4 };
        System.out.println("Q1 | Single element in array is: " + findSingle(arr1));

        // > Swap two values using XOR
        int value1 = 10;
        int value2 = 21;

        int[] result = swapUsingXOR(value1, value2);
        value1 = result[0];
        value2 = result[1];

        System.out.println("Q2 | Swapped values are value1: " + value1 + " value2: " + value2);

    }
}
