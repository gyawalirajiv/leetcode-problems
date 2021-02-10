package com.rajiv.increasingTripletSubsequence;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3) return false;

        int left = Integer.MAX_VALUE, middle = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= left){
                left = nums[i];
            } else if(nums[i] <= middle){
                middle = nums[i];
            } else return true;
        }
        return false;
    }

//    public static boolean increasingTriplet(int[] nums) {
//        if(nums == null || nums.length < 3) return false;
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            boolean foundMiddle = false;
//            int tempMiddle = Integer.MAX_VALUE;
//            for (int j = i+1; j < nums.length; j++) {
//                if(!foundMiddle){
//                    if(nums[j] > nums[i]){
//                        foundMiddle = true;
//                        tempMiddle = nums[j];
//                    }
//                } else {
//                    if(tempMiddle < nums[j]) return true;
//                    if(tempMiddle > nums[j] && nums[j] > nums[i]) tempMiddle = nums[j];
//                }
//            }
//        }
//
//        return false;
//    }
}
