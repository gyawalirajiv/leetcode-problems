package com.rajiv.wiggleSortII;

import java.util.Arrays;

public class WiggleSortII {
    public static void main(String[] args) {
        wiggleSort(new int[]{1,5,1,1,6,4});
    }

    public static void wiggleSort(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int index = sorted.length - 1;
        for (int i = 1; i < nums.length; i = i + 2) {
            nums[i] = sorted[index];
            index--;
        }

        for (int i = 0; i < nums.length; i = i + 2) {
            nums[i] = sorted[index];
            index--;
        }
    }
}
