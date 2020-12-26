package com.rajiv.helperClasses;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode (int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode (int[] vals){
        if(vals.length == 0) return;
        this.val = vals[0];
        ListNode current = this;
        for (int i = 1; i < vals.length; i++) {
            current.next = new ListNode(vals[i]);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
