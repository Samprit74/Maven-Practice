package com.roy.algo;

public final class CombinatoricsUtils {

    private CombinatoricsUtils() {
    }

    public static long nCr(int n, int r) {

        if (r < 0 || r > n)
            return 0;

        if (r > n - r)
            r = n - r;

        long result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }

        return result;
    }

    public static long nPr(int n, int r) {

        if (r < 0 || r > n)
            return 0;

        long result = 1;

        for (int i = 0; i < r; i++)
            result *= (n - i);

        return result;
    }
}