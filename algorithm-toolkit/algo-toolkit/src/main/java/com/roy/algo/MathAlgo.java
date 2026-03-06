package com.roy.algo;

import java.util.List;

public final class MathAlgo {

    private MathAlgo() {
    }

    public static int gcd(int a, int b) {
        return MathUtils.gcd(a, b);
    }

    public static int lcm(int a, int b) {
        return MathUtils.lcm(a, b);
    }

    public static long factorial(int n) {
        return Factorial.calc(n);
    }

    public static long factorialRec(int n) {
        return Factorial.rec(n);
    }

    public static int power(int base, int exp) {
        return MathUtils.power(base, exp);
    }

    public static long fibonacci(int n) {
        return Fibonacci.nth(n);
    }

    public static long fibonacciRec(int n) {
        return Fibonacci.rec(n);
    }

    public static boolean isPrime(int n) {
        return PrimeUtils.isPrime(n);
    }

    public static int nextPrime(int n) {
        return PrimeUtils.nextPrime(n);
    }

    public static boolean[] primeTable(int n) {
        return Seive.sieve(n);
    }

    public static List<Integer> primesUpTo(int n) {
        return Seive.primes(n);
    }

    public static long nCr(int n, int r) {
        return CombinatoricsUtils.nCr(n, r);
    }

    public static long nPr(int n, int r) {
        return CombinatoricsUtils.nPr(n, r);
    }

    public static boolean isPowerOfTwo(int n) {
        return BitUtils.isPowerOfTwo(n);
    }

    public static int countSetBits(int n) {
        return BitUtils.countSetBits(n);
    }
}