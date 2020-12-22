package com.rajiv.constructBinaryTreeFromPreorderAndInorderTraversal;

import com.rajiv.helperClasses.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        System.out.println(buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helperRecursion(0, 0, inorder.length - 1, preorder, inorder);
    }

    public static TreeNode helperRecursion(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart > preorder.length - 1 || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if(root.val == inorder[i]) inIndex = i;
        }

        root.left = helperRecursion(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = helperRecursion(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}
