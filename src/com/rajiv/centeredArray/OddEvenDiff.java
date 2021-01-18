package com.rajiv.centeredArray;

public class OddEvenDiff {
    public static void main(String[] args) {
        System.out.println(oddEvenDiff(new int[]{}));
    }

    public static int oddEvenDiff(int[] nums){
        if(nums == null || nums.length == 0) return 0;

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) evenSum += nums[i];
            else oddSum += nums[i];
        }
        return oddSum - evenSum;
    }
}
