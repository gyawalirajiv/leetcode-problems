package com.rajiv.houseRobber;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }

    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }

        return dp[nums.length];

    }


//    public static int rob(int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//
//        int first = helperRecursion(0, 0, nums);
//        int second = helperRecursion(1, 0, nums);
//
//        return first > second ? first : second;
//    }
//
//    public static int helperRecursion(int currentIndex, int cashTillNow, int[] nums){
//        if(currentIndex >= nums.length) return cashTillNow;
//
//        cashTillNow += nums[currentIndex];
//
//        int first = helperRecursion(currentIndex + 2, cashTillNow, nums);
//        int second = helperRecursion(currentIndex + 3, cashTillNow, nums);
//
//        return first > second ? first : second;
//    }
}
