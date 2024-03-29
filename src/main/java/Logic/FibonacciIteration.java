package Logic;

public class FibonacciIteration {
    // Memory: 1 Time: O(n)
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0;
        long fib = 1;
        long temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = a;
            a = fib;
            fib = temp + fib;
        }
        return fib;
    }
}
