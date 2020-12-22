package com.rajiv.getIntersectionNode;
import com.company.helperClasses.ListNode;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(new int[]{5,6,1,8,4,5});
        ListNode node2 = new ListNode(new int[]{4,1});
        node2.next = node1.next.next.next;

        System.out.println(getIntersectionNode(node2, node1));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        int l1 = 0;
        int l2 = 0;
        ListNode current1 = headA;
        ListNode current2 = headB;
        while (current1 != null){
            l1++;
            current1 = current1.next;
        }
        while (current2 != null){
            l2++;
            current2 = current2.next;
        }

        current1 = headA;
        current2 = headB;
        int diff = l1 - l2;
        if(diff > 0){
            while (diff != 0){
                current1 = current1.next;
                diff--;
            }
        } else {
            diff *= -1;
            while (diff != 0){
                current2 = current2.next;
                diff--;
            }
        }

        while (current1 != current2 && current1 != null && current2 != null){
            current1 = current1.next;
            current2 = current2.next;
        }
        if (current1 == current2) return current1;
        return null;
    }
}
