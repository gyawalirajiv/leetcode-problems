package com.rajiv.populatingNextRightPointersInEachNode;

import com.rajiv.helperClasses.TreeNode;
import com.rajiv.helperClasses.TreeNode.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PopulatingNextRightPointersInEachNode {
    public static void main(String[] args) {
        System.out.println(connect(new Node(new int[]{1,2,3,4,5,6,7})));
    }

    public static Node connect(Node root) {
        if(root == null) return null;

        Queue<Node> stack = new LinkedList<>();
        Queue<Node> connectingStack = new LinkedList<>();
        stack.add(root);
        while (stack.size() != 0){
            int stackSize = stack.size();
            for (int i = 0; i < stackSize; i++) {
                Node current = stack.poll();
                if (current.left != null) {
                    stack.add(current.left);
                    connectingStack.add(current.left);
                }
                if (current.right != null) {
                    stack.add(current.right);
                    connectingStack.add(current.right);
                }
            }
            for (int i = 0; i < connectingStack.size(); ) {
                Node current = connectingStack.poll();
                if(connectingStack.peek() != null) current.next = connectingStack.peek();
            }
            connectingStack.clear();
        }

        return root;
    }

}


