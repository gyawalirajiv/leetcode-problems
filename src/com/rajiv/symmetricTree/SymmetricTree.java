package com.rajiv.symmetricTree;

import com.rajiv.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(new ArrayList<>(Arrays.asList(1,2,2,null,3,null,3)));
        System.out.println(isSymmetric(node));
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;

        TreeNode left = root.left;
        TreeNode right = root.right;

        return checkSymmetry(left, right);
    }

    public static boolean checkSymmetry(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;

        boolean leftCheck = checkSymmetry(left.right, right.left);
        boolean rightCheck = checkSymmetry(left.left, right.right);

        if (leftCheck && rightCheck) return true;
        return false;
    }
}
