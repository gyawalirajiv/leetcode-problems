package com.rajiv.binaryTreeLevelOrderTraversal;

import com.rajiv.helperClasses.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        System.out.println(levelOrder(new TreeNode(Arrays.asList(3,9,20,null,null,15,7))));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() != 0){
            int currentSize = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            output.add(list);
        }
        return output;
    }

//    public static List<List<Integer>> levelOrder(TreeNode root) {
//        if(root == null) return new ArrayList<>();
//
//        List<List<Integer>> list = new ArrayList<>();
//        helperRecursion(root, 0, list);
//        return list;
//    }
//
//    public static void helperRecursion(TreeNode root, int level, List<List<Integer>> list){
//        if(root == null) return;
//
//        List<Integer> current;
//        try {
//            current = list.get(level);
//            current.add(root.val);
//        } catch (Exception e){
//            List<Integer> temp = new ArrayList<>();
//            temp.add(root.val);
//            list.add(temp);
//        }
//
//        helperRecursion(root.left, level + 1, list);
//        helperRecursion(root.right, level + 1, list);
//    }
}
