package com.rajiv.canJump;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }

    public static boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;

        int validRightIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(i + nums[i] >= validRightIndex){
                validRightIndex = i;
            }
        }
        return validRightIndex == 0;
    }

}
