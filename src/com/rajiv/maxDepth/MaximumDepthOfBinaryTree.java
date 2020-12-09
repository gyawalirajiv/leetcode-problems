package com.rajiv.maxDepth;

import com.rajiv.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(new ArrayList<>(Arrays.asList(3, 9, 20, null, null, 15, 7)));
        System.out.println(maxDepth(node));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return helper(root, 0);
    }

    public static int helper(TreeNode root, int max){
        if(root.left == null && root.right == null) return max + 1;

        int leftMax = 0;
        int rightMax = 0;
        if(root.left != null) leftMax = helper(root.left, max + 1);
        if(root.right != null) rightMax = helper(root.right, max + 1);

        if(leftMax > rightMax) return leftMax;
        return rightMax;
    }
}
