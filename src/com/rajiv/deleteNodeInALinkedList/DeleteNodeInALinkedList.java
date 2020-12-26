package com.rajiv.deleteNodeInALinkedList;

import com.rajiv.helperClasses.ListNode;


public class DeleteNodeInALinkedList {
	public static void main(String[] args) {
		deleteNode(new ListNode(new int[] {5,1,9}));
	}
	
	public static void deleteNode(ListNode node) {
        if(node == null) return;
		
		ListNode current = node;
		ListNode prev = null;
		while(current.next != null) {
			current.val = current.next.val;
			prev = current;
			current = current.next;
		}
		prev.next = null;
		System.out.println(prev);
    }
}
