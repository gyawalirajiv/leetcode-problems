package com.rajiv.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }

        return false;
    }
}
