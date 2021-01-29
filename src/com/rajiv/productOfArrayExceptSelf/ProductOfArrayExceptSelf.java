package com.rajiv.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{0,0}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] output = new int[N];

        output[0] = 1;
        for (int i = 1; i < N; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        int R = 1;
        for (int i = N - 1; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
    }
}
