package com.company.addTwoNumbers;

import com.company.helperClasses.ListNode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = new ListNode(new int[]{9,9,9,9});
//        l1.val = 2;
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

//        l2.val = 5;
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = l1.val + l2.val;
        l1 = l1.next;
        l2 = l2.next;
        if(sum > 9){
            carry = sum / 10;
            sum = sum % 10;
        }
        ListNode head = new ListNode(sum);
        ListNode current = head;

        while (l1 != null || l2 != null){
            sum = 0;
            sum += carry;
            carry = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            }
            current.next = new ListNode(sum);
            current = current.next;
        }
        if(carry != 0) current.next = new ListNode(carry);

        return head;
    }

}
