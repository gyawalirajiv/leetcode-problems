package com.rajiv.moveZeroes;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            nums[left] = nums[i];
            left++;
        }

        while (left < nums.length){
            nums[left] = 0;
            left++;
        }
    }
}
