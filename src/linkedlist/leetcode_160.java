package linkedlist;

import common.ListNode;

public class leetcode_160 {

    // // Brute-force
    // public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // while (headA != null) {
    // ListNode curr = headB;
    // while (curr != null) {
    // if (headA == curr) {
    // return headA;
    // }
    // curr = curr.next;
    // }
    // headA = headA.next;
    // }
    // return null;
    // }

    // // Hash table
    // public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // HashMap<ListNode, ListNode> hashMap = new HashMap<>();
    // while (headB != null) {
    // hashMap.put(headB, headB);
    // headB = headB.next;
    // }

    // while (headA != null) {
    // if (hashMap.containsKey(headA)) {
    // return headA;
    // }
    // headA = headA.next;
    // }
    // return headA;
    // }

    // Two Points
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4,
                new ListNode(1,
                        new ListNode(8,
                                new ListNode(4,
                                        new ListNode(5)))));

        ListNode headB = new ListNode(5,
                new ListNode(6,
                        new ListNode(1,
                                new ListNode(8,
                                        new ListNode(4,
                                                new ListNode(5))))));

        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(1, 2);
        // map.put(1, 3);
        // System.out.println("result: " + map.get(1));
        ListNode result = getIntersectionNode(headA, headB);

        while (result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }
    }
}
