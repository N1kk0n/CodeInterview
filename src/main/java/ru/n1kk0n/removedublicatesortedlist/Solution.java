package ru.n1kk0n.removedublicatesortedlist;

public class Solution {
    public static ListNode removeDublicates(ListNode head) {
        ListNode curr = head;
        //cover empty list case
        if (curr == null) {
            return head;
        }
        while (curr.getNext() != null) {
            if (curr.getVal() == curr.getNext().getVal()) {
                curr.setNext(curr.getNext().getNext());
            } else {
                curr = curr.getNext();
            }
        }
        return head;
    }

    public static void showList(ListNode head) {
        while (head != null) {
            System.out.print(head.getVal());
            if (head.getNext() != null) {
                System.out.print(" -> ");
            } else {
                System.out.print("\n");
            }
            head = head.getNext();
        }
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(1);

        first.setNext(second);
        second.setNext(third);

        showList(first);

        ListNode newHead = removeDublicates(first);

        showList(newHead);
    }
}