package com.rajiv.validateBinarySearchTree;

import com.rajiv.helperClasses.TreeNode;

import java.util.Arrays;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(Arrays.asList(2147483647));
        System.out.println(isValidBST(node));
    }

    public static boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;

        return helperRecursion(root, null, null);
    }

    public static boolean helperRecursion(TreeNode node, Integer max, Integer min){
        if((max != null && node.val >= max) || (min != null && node.val <= min)) return false;
        if (node.left == null && node.right == null) return true;

        boolean left = true;
        boolean right = true;
        if(node.left != null) left = helperRecursion(node.left, node.val, min);
        if(node.right != null) right = helperRecursion(node.right, max, node.val);

        if(left && right) return true;
        return false;
    }
}
