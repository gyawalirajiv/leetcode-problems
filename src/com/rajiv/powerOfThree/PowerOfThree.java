package com.rajiv.powerOfThree;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1162261467));
    }

    public static boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1 || n == 3) return true;

        long power = 3;
        while (power <= n && power <= Long.MAX_VALUE / 3){
            if(power == n) return true;
            power *= 3;
        }
        return false;
    }
}
