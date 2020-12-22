package com.rajiv.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0 || nums == null) return new ArrayList<>();

        List<List<Integer>> output = new ArrayList<>();
        helperRecursion(0, new ArrayList<>(), output, nums);
        return output;
    }

    public static void helperRecursion(int index, List<Integer> currentList,
                                       List<List<Integer>> output, int[] nums){
        if(index == nums.length) {
            output.add(new ArrayList<>(currentList));
            return;
        }

        currentList.add(nums[index]);
        helperRecursion(index + 1, currentList, output, nums);
        currentList.remove(currentList.size() - 1);
        helperRecursion(index + 1, currentList, output, nums);
    }
}
