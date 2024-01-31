package Logic;

public class FibonacciRecursive {

    // Memory: n Time: O(2^n)
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
