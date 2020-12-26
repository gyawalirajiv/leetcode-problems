package com.rajiv.reverseLinkedList;

import com.rajiv.helperClasses.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println(reverseList(new ListNode(new int[]{1,2,3,4,5})));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
