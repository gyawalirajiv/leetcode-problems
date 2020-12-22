package com.rajiv.countPrimes;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        if(n == 1 || n == 0) return 0;

        boolean[] primes = new boolean[n];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if(primes[i]){
                for (int j = i * i; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        int output = 0;
        for (int i = 0; i < primes.length; i++) {
            if(primes[i]) output++;
        }

        return output;

    }
}
