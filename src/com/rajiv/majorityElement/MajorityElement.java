package com.rajiv.majorityElement;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count+1);
                if(count+1 > nums.length / 2) return nums[i];
            } else map.put(nums[i], 1);
        }

        return -1;
    }
}
