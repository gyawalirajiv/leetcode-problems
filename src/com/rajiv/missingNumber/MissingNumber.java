package com.rajiv.missingNumber;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }

    public static int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) return -1;

        boolean[] digitTracker = new boolean[nums.length + 1];
        for (int n : nums){
            if(n >= nums.length){
                digitTracker[digitTracker.length - 1] = true;
            } else {
                digitTracker[n] = true;
            }
        }
        for (int i = 0; i < digitTracker.length; i++) {
            if(!digitTracker[i]) return i;

        }

        return nums.length;
    }
}
