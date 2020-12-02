package com.rajiv.mySqrt;

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(15));
    }

    public static int mySqrt(int x) {

        int start = 0;
        int end = x;

        while (start + 1 < end){
            long mid = start + ((end - start) / 2);
            if(mid * mid == x) return (int) mid;
            else if(mid * mid < x) start = (int) mid;
            else end = (int) mid;
        }

        if(end * end == x) return end;
        return start;
    }
}
