package com.rajiv.longestIncreasingSubsequence;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    public static int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;

        int[] max = new int[nums.length];
        for (int i = 0; i < max.length; i++) {
            max[i] = 1;
        }

        int left = 0;
        int right = 1;
        while (right < nums.length){
            while (left < right){
                if(nums[left] < nums[right]){
                    max[right] = Math.max(max[right], max[left] + 1);
                }
                left++;
            }
            left = 0;
            right++;
        }

        int output = 1;
        for(int n: max){
            if(n > output) output = n;
        }
        return output;
    }
}
