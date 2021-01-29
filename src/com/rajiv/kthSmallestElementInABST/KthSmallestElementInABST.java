package com.rajiv.kthSmallestElementInABST;

import com.rajiv.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new TreeNode(Arrays.asList(5,3,6,2,4,null,null,1)), 3));
    }

    public static int kthSmallest(TreeNode root, int k) {
        if(root == null || k < 1) return Integer.MIN_VALUE;

        List<Integer> list = new ArrayList<>();
        inorder(root, list, k);
        return list.get(k-1);
    }

    public static void inorder(TreeNode node, List<Integer> list, int k){
        if(list.size() == k) return;

        if(node.left != null) inorder(node.left, list, k);

        list.add(node.val);
        k++;

        if(node.right != null) inorder(node.right, list, k);
    }
}
