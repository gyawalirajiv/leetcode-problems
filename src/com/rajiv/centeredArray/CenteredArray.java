package com.rajiv.centeredArray;

public class CenteredArray {
    public static void main(String[] args) {
        System.out.println(centeredArray(new int[]{}));
    }

    public static int centeredArray(int[] nums){
        if(nums == null || nums.length == 0 || nums.length % 2 == 0) return 0;

        int mid = nums.length / 2;
        int left = mid - 1;
        int right = mid + 1;
        while (right < nums.length){
            if(nums[mid] >= nums[left]) return 0;
            if(nums[mid] >= nums[right]) return 0;

            left--;
            right++;
        }

        return 1;
    }
}
