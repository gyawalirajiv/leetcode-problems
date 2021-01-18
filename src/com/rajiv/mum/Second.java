package com.rajiv.mum;

public class Second {
    public static void main(String[] args) {
        isRapidlyIncreasing(new int[]{1, 3, 9, 27});
        isRapidlyIncreasing(new int[]{1, 3, 200, 500});
        isRapidlyIncreasing(new int[]{1});
        isRapidlyIncreasing(new int[]{1, 3, 9, 26});
        isRapidlyIncreasing(new int[]{1, 3, 7, 26});
        isRapidlyIncreasing(new int[]{1, 3, 8, 26});
    }

    public static int isRapidlyIncreasing(int[] a){

        int precedingSum = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] <= (precedingSum * 2)) return 0;
            precedingSum += a[i];
        }
        return 1;
    }



}
