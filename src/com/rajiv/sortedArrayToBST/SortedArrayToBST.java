package com.rajiv.sortedArrayToBST;

import com.rajiv.helperClasses.TreeNode;

public class SortedArrayToBST {
    public static void main(String[] args) {

        System.out.println(sortedArrayToBST(new int[]{-10,-3,0,5,9}));

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;

        TreeNode node = helperRecursion(0, nums.length - 1, nums);
        return node;

    }

    public static TreeNode helperRecursion(int left, int right, int[] nums){
        if(left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = helperRecursion(left, mid - 1, nums);
        node.right = helperRecursion(mid + 1, right, nums);
        return node;
    }
}
