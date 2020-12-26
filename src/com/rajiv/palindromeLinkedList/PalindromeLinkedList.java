package com.rajiv.palindromeLinkedList;
import com.rajiv.helperClasses.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(new int[]{-129,-129})));
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            if(!list.get(left).equals(list.get(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}
