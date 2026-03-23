package DynamicProgramming;

public class BasicsOfDP {

    // Bad code take TC of 2^n amd have problem of overlaping sub-problems
    public static int fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    static int memo[];

    public static int fiboViaDp(int n) {
        if (n <= 1)
            return n;
        if (memo[n] != 0)
            return memo[n];
        int ans = fiboViaDp(n - 1) + fiboViaDp(n - 2);
        memo[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        int n = 60;

        // Without DP | Time taken is approx 400ms (which is approx ~77,000× faster)
        long start1 = System.nanoTime();
        int res1 = fibo(n);
        long end1 = System.nanoTime();

        System.out.print("Recursive without DP: " + res1);
        System.out.println(" | Time taken (no DP): " + (end1 - start1) / 1_000_000.0 + " ms");

        // With DP | Time taken is approx 0.0055 ms
        memo = new int[n + 1];

        long start2 = System.nanoTime();
        int res2 = fiboViaDp(n);
        long end2 = System.nanoTime();

        System.out.print("Recursive with DP: " + res2);
        System.out.println(" | Time taken (DP): " + (end2 - start2) / 1_000_000.0 + " ms");

    }
}
