package com.rajiv.myPow;

public class MyPow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 8));
    }

    public static double myPow(double x, int n) {
        if(n == 1) return x;
        if(n == 0) return 1;
        if(x == 0) return 0;
        if(x == 1) return x;

        double res = 1.0;
        long longN = n;
        if(n < 0) longN *= -1;

        while (longN > 0){
            if(longN % 2 == 0){
                x = x * x;
                longN /= 2;
            } else {
                res *= x;
                longN--;
            }
        }

        if(n < 0) return (double) 1 / res;
        return res;
    }
}
