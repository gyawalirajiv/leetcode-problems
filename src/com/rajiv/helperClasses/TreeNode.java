package com.rajiv.helperClasses;

import com.rajiv.populatingNextRightPointersInEachNode.PopulatingNextRightPointersInEachNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int[] values){
        if(values.length == 0) return;
        val = values[0];

        Queue<TreeNode> q = new LinkedList<>();
        q.add(this);
        boolean left = true;
        for (int i = 1; i < values.length; i++) {
            TreeNode node = new TreeNode(values[i]);
            if(left){
                q.peek().left = node;
                left = false;
            } else {
                q.poll().right = node;
                left = true;
            }
            q.add(node);
        }
    }

    public TreeNode(List<Integer> values){
        if(values.size() == 0 || values.get(0) == null) return;
        val = values.get(0);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(this);
        boolean left = true;
        for (int i = 1; i < values.size(); i++) {
            TreeNode node = values.get(i) != null ? new TreeNode(values.get(i)): null;
            if(left){
                q.peek().left = node;
                left = false;
            } else {
                q.poll().right = node;
                left = true;
            }
            q.add(node);
        }
    }

    public static class Node extends TreeNode{
        public Node next;
        public Node left;
        public Node right;

        public Node(int val) { this.val = val; }

        public Node(int[] values) {
            if(values.length == 0) return;
            val = values[0];

            Queue<Node> q = new LinkedList<>();
            q.add(this);
            boolean left = true;
            for (int i = 1; i < values.length; i++) {
                Node node = new Node(values[i]);
                if(left){
                    q.peek().left = node;
                    left = false;
                } else {
                    q.poll().right = node;
                    left = true;
                }
                q.add(node);
            }
        }
    }
}
