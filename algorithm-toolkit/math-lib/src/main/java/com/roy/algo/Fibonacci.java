package com.roy.algo;

public final class Fibonacci {

    private Fibonacci() {}

    public static long nth(int n) {

        if (n < 0)
            throw new IllegalArgumentException("n must be non-negative");

        if (n <= 1)
            return n;

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {

            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static long rec(int n) {

        if (n < 0)
            throw new IllegalArgumentException("n must be non-negative");

        if (n <= 1)
            return n;

        return rec(n - 1) + rec(n - 2);
    }
}