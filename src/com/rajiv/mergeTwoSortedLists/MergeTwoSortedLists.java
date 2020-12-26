package com.rajiv.mergeTwoSortedLists;
import com.rajiv.helperClasses.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(new int[]{1,2,4});
        ListNode l2 = new ListNode(new int[]{1,3,4});
        System.out.println(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head;
        if(l1.val < l2.val){
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        ListNode current = head;

        while (l1 != null || l2 != null){
            if(l1 == null) {
                current.next = l2;
                l2 = l2.next;
            } else if(l2 == null) {
                current.next = l1;
                l1 = l1.next;
            } else if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            } else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null) current.next = l1;
        if(l2 != null) current.next = l2;

        return head;

    }
}
