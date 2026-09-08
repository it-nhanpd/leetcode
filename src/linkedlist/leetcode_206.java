package linkedlist;

import common.ListNode;


public class leetcode_206{

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    public static void main(String[] args){
        ListNode head =
            new ListNode(1,
                new ListNode(2,
                    new ListNode(3)));

        ListNode result = reverseList(head);

        while (result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }
    }
} 
