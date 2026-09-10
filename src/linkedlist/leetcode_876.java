package linkedlist;

import common.ListNode;

public class leetcode_876 {
    // Slow & fast
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,

                                new ListNode(4,
                                        new ListNode(5)))));

        ListNode result = middleNode(head);

        while (result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }
    }
}
