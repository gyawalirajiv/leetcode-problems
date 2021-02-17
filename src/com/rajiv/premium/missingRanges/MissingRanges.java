package com.rajiv.premium.missingRanges;

import java.util.ArrayList;
import java.util.List;

//163 Missing Ranges
//Given a sorted integer array nums, where the range of elements are
// in the inclusive range [lower, upper], return its missing ranges.

//Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
//        Output: ["2", "4->49", "51->74", "76->99"]

public class MissingRanges {
    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> output = new ArrayList<>();

        int pointer = 0;
        int lowerValue = lower;
        while (pointer < nums.length){
            if(lowerValue == nums[pointer]) {
                lowerValue = nums[pointer] + 1;
                pointer++;
                continue;
            }

            if(nums[pointer] - lowerValue == 1) output.add(String.valueOf(lowerValue));
            else output.add(lowerValue + "->" + (nums[pointer] - 1));
            lowerValue = nums[pointer] + 1;
            pointer++;
        }

        if(nums[pointer-1] < upper) {
            if(upper - nums[pointer-1] == 1)
                output.add(String.valueOf(upper));
            else output.add((nums[pointer-1] + 1) + "->" + upper);
        }

        return output;
    }
}
