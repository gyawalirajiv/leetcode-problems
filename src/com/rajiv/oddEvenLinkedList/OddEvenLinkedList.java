package com.rajiv.oddEvenLinkedList;

import com.rajiv.helperClasses.ListNode;

import java.util.Arrays;

public class OddEvenLinkedList {
    public static void main(String[] args) {
//        ListNode node = new ListNode(new int[]{1,2,3,4,5,6,7,8});
        ListNode node = new ListNode(new int[]{1,1});
        System.out.println(oddEvenList(node));
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode oddPointer = head;
        ListNode evenHead = head.next;
        ListNode evenPointer = head.next;

        while (oddPointer != null && oddPointer.next != null && oddPointer.next.next != null){
            ListNode next = oddPointer.next;
            oddPointer.next = oddPointer.next.next;
            oddPointer = oddPointer.next;

            evenPointer.next = next;
            evenPointer = evenPointer.next;
        }

        if(oddPointer.next != null && oddPointer.next != evenPointer){
            evenPointer.next = oddPointer.next;
        } else {
            evenPointer.next = null;
        }
        oddPointer.next = evenHead;

        return head;
    }
}
