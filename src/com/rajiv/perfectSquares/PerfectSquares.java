package com.rajiv.perfectSquares;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

    public static int numSquares(int n) {
        if(n < 0) return Integer.MAX_VALUE;
        if(n == 0) return 0;
        int min = n;
        for (int i = 1; i*i <= n; i++) {
            min = Math.min(numSquares(n - (i*i)), min);
        }
        return min+1;
    }
}
