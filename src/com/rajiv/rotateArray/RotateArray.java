package com.rajiv.rotateArray;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k == 0) return;

        int[] duplicate = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < nums.length; i++) {
            int index = (i + k) % nums.length;
            nums[index] = duplicate[i];
        }
    }
}
