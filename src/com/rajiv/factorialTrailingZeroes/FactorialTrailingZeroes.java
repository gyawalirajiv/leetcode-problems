package com.rajiv.factorialTrailingZeroes;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }

    public static int trailingZeroes(int n) {
        if(n == 0 || n < 5) return 0;

        int numberOfFivePresent = 0;
        while (n >= 5){
            numberOfFivePresent += n / 5;
            n = n / 5;
        }

        return numberOfFivePresent;
    }
}
