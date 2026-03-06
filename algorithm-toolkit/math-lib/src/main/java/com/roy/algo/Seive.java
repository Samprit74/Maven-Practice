package com.roy.algo;

import java.util.ArrayList;
import java.util.List;

public final class Seive {

    private Seive() {}

    public static boolean[] sieve(int n) {

        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {

            if (prime[p]) {

                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        return prime;
    }

    public static List<Integer> primes(int n) {

        boolean[] prime = sieve(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            if (prime[i])
                list.add(i);
        }

        return list;
    }
}