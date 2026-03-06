package com.roy.algo;

public final class PrimeUtils {

    private PrimeUtils() {}

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {

            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static int nextPrime(int n) {

        int num = n + 1;

        while (!isPrime(num))
            num++;

        return num;
    }
}