package com.rajiv.largestNumber;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{0,0,0}));
    }

    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Long ij = Long.parseLong(nums[i] + "" + nums[j]);
                Long ji = Long.parseLong(nums[j] + "" + nums[i]);
                if(ji > ij){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        String answer = "";
        boolean foundFirstNonZero = false;
        for (Integer num: nums) {
            if(num != 0) foundFirstNonZero = true;
            if (num == 0 && foundFirstNonZero == false) continue;
            answer += num;
        }

        return answer.equals("") ? "0" : answer;
    }
}
