package com.rajiv.permute;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> permutation = new ArrayList<>();
        permuteRecursively(nums, permutation, used, res);
        return res;
    }

    public static void permuteRecursively(int[] nums, List<Integer> permutation,
                                          boolean[] used, List<List<Integer>> res){

        if(permutation.size() == nums.length) {
            res.add(new ArrayList<>(permutation));
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true) continue;
            used[i] = true;
            permutation.add(nums[i]);
            permuteRecursively(nums, permutation, used, res);
            used[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}
