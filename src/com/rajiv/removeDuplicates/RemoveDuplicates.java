package com.rajiv.removeDuplicates;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(numbers));
    }

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;

        int left = 0;
        int right = 1;

        while (right < nums.length){
            if(nums[right] != nums[left]){
                nums[left + 1] = nums[right];
                left++;
            }
            right++;
        }
        return left+1;
    }
}
