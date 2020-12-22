package com.rajiv.binaryTreeZigzagLevelOrderTraversal;

import com.rajiv.helperClasses.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println(zigzagLevelOrder(new TreeNode(Arrays.asList(3,9,20,null,null,15,7))));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> output = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Boolean leftToRight = false;

        while (stack.size() != 0){
            List<Integer> list = new ArrayList<>();
            int size = stack.size();
            Stack<TreeNode> tempStack = new Stack<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = stack.pop();
                list.add(node.val);
                if(leftToRight){
                    if(node.right != null) tempStack.push(node.right);
                    if(node.left != null) tempStack.push(node.left);
                } else {
                    if(node.left != null) tempStack.push(node.left);
                    if(node.right != null) tempStack.push(node.right);
                }
            }
            stack = tempStack;
            leftToRight = !leftToRight;
            output.add(list);
        }

        return output;
    }
}
