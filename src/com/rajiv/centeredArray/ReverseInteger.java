package com.rajiv.centeredArray;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(-12345));
    }

    public static int reverseInteger(int n){

        boolean isNeg = false;
        if(n < 0) {
            isNeg = true;
            n *= -1;
        }

        int output = n % 10;
        n /= 10;

        while (n != 0){
            output *= 10;
            output += n % 10;
            n /= 10;
        }

        return isNeg ? output * -1 : output;
    }
}
