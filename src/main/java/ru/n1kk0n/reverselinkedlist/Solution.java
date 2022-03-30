package ru.n1kk0n.reverselinkedlist;

public class Solution {
    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        
        // =============================
        // prev  curr   next  
        //  |     |      |
        // null   0  ->  1  ->  2  -> 3 
        //  
        while (curr != null) {
            // prev  curr   next  
            //  |     |      |
            // null   0  ->  1  ->  2  -> 3 
            //
            next = curr.getNext();
            
            // prev    curr   next  
            //  |        |     |
            // null  <-  0     1  ->  2  -> 3 
            //  
            curr.setNext(prev);
            
            //         prev   next  
            //          |     |
            // null <-  0     1  ->  2  -> 3 
            //
            prev = curr;
            
            //         prev  curr  
            //          |     |
            // null <-  0     1  ->  2  -> 3 
            //
            curr = next;
        }
        return prev;
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
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        first.setNext(second);
        second.setNext(third);

        showList(first);

        ListNode newHead = reverse(first);

        showList(newHead);
    }
}
