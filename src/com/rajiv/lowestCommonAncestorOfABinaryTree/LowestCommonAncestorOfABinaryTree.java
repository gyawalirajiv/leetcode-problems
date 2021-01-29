package com.rajiv.lowestCommonAncestorOfABinaryTree;

import com.rajiv.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4));
        System.out.println(lowestCommonAncestor(node, node.left, node.left.right.right).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        if(p == q) return p;

        List<TreeNode> listP = new ArrayList<>();
        List<TreeNode> listQ = new ArrayList<>();

        backtrackingToFindTheNode(root, listP, p);
        backtrackingToFindTheNode(root, listQ, q);

        int index = 0;
        while (index < listP.size() && index < listQ.size()){
            if(listP.get(index) != listQ.get(index)) break;
            index++;
        }

        return listP.get(index-1);
    }

    public static boolean backtrackingToFindTheNode(TreeNode node, List<TreeNode> list, TreeNode toFind){
        if(node == null) return false;
        if(node.val == toFind.val) {
            list.add(node);
            return true;
        }

        list.add(node);
        if(backtrackingToFindTheNode(node.left, list, toFind)) return true;
        if(backtrackingToFindTheNode(node.right, list, toFind)) return true;
        list.remove(list.size() - 1);
        return false;
    }

}
