package com.rajiv.ThreeSum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
//        [-4,-1,-1,0,1,2]
        List<List<Integer>> output = new LinkedList<>();

        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int left = i+1;
                int right = nums.length - 1;
                int sum = -1 * nums[i];

                while(left < right){
                    if(nums[left] + nums[right] == sum){
                        output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    } else if(nums[left] + nums[right] < sum) {
                        left++;
                    } else right--;
                }
            }
        }

        return output;

    }


}
