package com.rajiv.centeredArray;

public class PointOfEquilibrium {
    public static void main(String[] args) {
        System.out.println(pointOfEquilibrium(new int[]{1, 8, 3, 7, 10, 2}));
    }

    public static int pointOfEquilibrium(int[] a){
        if(a == null || a.length == 0) return -1;

        for (int i = 1; i < a.length - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            int leftSum = 0;
            int rightSum = 0;
            while (left >= 0 || right < a.length){
                if(left >= 0) {
                    leftSum += a[left];
                    left--;
                }
                if(right < a.length){
                    rightSum += a[right];
                    right++;
                }
            }
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}
