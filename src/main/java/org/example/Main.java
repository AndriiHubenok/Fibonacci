package org.example;

import Logic.FibonacciDP;
import Logic.FibonacciIteration;
import Logic.FibonacciRecursive;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 10;
        long resultIteration = FibonacciIteration.fibonacci(n);
        long resultRecursive = FibonacciRecursive.fibonacci(n);
        long resultDP = FibonacciDP.fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + resultIteration);
        System.out.println("Fibonacci(" + n + ") = " + resultRecursive);
        System.out.println("Fibonacci(" + n + ") = " + resultDP);
    }
}