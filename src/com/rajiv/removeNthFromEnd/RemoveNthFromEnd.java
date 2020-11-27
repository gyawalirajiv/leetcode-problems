package com.rajiv.removeNthFromEnd;
import com.company.helperClasses.ListNode;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode node = new ListNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(removeNthFromEnd(node, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        if(head == null) return null;
        if(head.next == null && n == 1) return null;

        ListNode fast = head;
        ListNode slow = head;
        while (n != 0){
            fast = fast.next;
            n--;
        }
        if(fast == null) return head.next;

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
