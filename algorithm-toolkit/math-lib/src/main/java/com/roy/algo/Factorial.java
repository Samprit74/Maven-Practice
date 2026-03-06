package com.roy.algo;

public final class Factorial {

    private Factorial() {
    }

    public static long calc(int n) {

        if (n < 0)
            throw new IllegalArgumentException("n must be non-negative");

        long result = 1;

        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }

    public static long rec(int n) {

        if (n < 0)
            throw new IllegalArgumentException("n must be non-negative");

        if (n == 0 || n == 1)
            return 1;

        return n * rec(n - 1);
    }
}