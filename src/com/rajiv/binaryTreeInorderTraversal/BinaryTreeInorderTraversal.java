package com.rajiv.binaryTreeInorderTraversal;

import com.rajiv.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        helperRecursion(root, list);
        return list;
    }

    public static void helperRecursion(TreeNode node, List<Integer> list){
        if(node.left != null) helperRecursion(node.left, list);
        list.add(node.val);
        if(node.right != null) helperRecursion(node.right, list);
    }
}
