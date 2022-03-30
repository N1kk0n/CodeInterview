package ru.n1kk0n.reverselinkedlist;

public class ListNode {
    private ListNode next;
    private int val;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
