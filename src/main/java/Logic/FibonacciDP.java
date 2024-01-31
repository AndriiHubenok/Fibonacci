package Logic;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
    private static Map<Integer, Long> memo = new HashMap<>();
    // Memory: n Time: 1 + 1 + 1 + 1 + n - 1 + n - 2 + 1 + 1 ~ n
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }
}
