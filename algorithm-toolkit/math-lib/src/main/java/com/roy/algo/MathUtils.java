package com.roy.algo;

public final class MathUtils {

    private MathUtils() {}

    public static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return Math.abs(a);
    }

    public static int lcm(int a, int b) {

        return Math.abs(a * b) / gcd(a, b);
    }

    public static long factorial(int n) {

        if (n < 0)
            throw new IllegalArgumentException("n must be >= 0");

        long result = 1;

        for (int i = 2; i <= n; i++)
            result *= i;

        return result;
    }

    public static int power(int base, int exp) {

        int result = 1;

        while (exp > 0) {

            if ((exp & 1) == 1)
                result *= base;

            base *= base;
            exp >>= 1;
        }

        return result;
    }
}