package com.rajiv.findTheDuplicateNumber;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }

    public static int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)) return n;
            set.add(n);
        }

        return Integer.MAX_VALUE;
    }
}
