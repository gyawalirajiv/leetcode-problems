package com.rajiv.hasCycle;
import com.rajiv.helperClasses.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        node.next = new ListNode(2);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(-4);
        node.next.next.next.next = node.next;
        System.out.println(hasCycle(node));
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null){
            if(fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
