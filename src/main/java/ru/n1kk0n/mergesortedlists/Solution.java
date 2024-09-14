package ru.n1kk0n.mergesortedlists;

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode pointer = null;
        while (true) {
            if (list1 == null && list2 == null) {
                return head;
            }
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    pointer = list1;
                    list1 = list1.next;
                } else {
                    pointer = list2;
                    list2 = list2.next;
                }
                pointer.next = pointer;
            }
            if (head == null) {
                head = pointer;
            }
        }
    }

    public static void main(String[] args) {
        ListNode a3 = new ListNode(3, null);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode b3 = new ListNode(7, null);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(2, b2);

    }
}
