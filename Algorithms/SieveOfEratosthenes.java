package Algorithms;

public class SieveOfEratosthenes {

    // this is used to find count of non prime or prime numbers from reange 0 to N

    static int countPrime(int N) {
        boolean[] numbers = new boolean[N];
        java.util.Arrays.fill(numbers, true);
        int count = 0;
        for (int i = 2; i < N; i++) {
            if (numbers[i]) {
                count++;
                for (int j = i * 2; j < N; j += i) {
                    numbers[j] = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrime(500));
    }
}
