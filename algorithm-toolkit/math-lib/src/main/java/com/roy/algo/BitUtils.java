package com.roy.algo;

public final class BitUtils {

    private BitUtils() {}

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {

        int count = 0;

        while (n != 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
}