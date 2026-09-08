package linkedlist;

import common.ListNode;

public class leetcode_83 {
    // public static ListNode deleteDuplicates(ListNode head) {
    //     ListNode dummy = new ListNode(-1);
    //     ListNode tail = dummy;
    //     Set<Integer> set = new HashSet<>();
    //     while(head != null){
    //         if(!set.contains(head.val)){
    //             set.add(head.val);
    //             tail.next = head;
    //             tail = tail.next;
    //         }
    //         head = head.next;
    //     }
    //     tail.next = null;
    //     return dummy.next;
    // }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val != curr.next.val){
                curr = curr.next;  
            }else{
                curr.next = curr.next.next;
                
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head =
            new ListNode(1,
                new ListNode(1,
                    new ListNode(2,
                        new ListNode(3,
                            new ListNode(3,
                                new ListNode(3,
                                    new ListNode(4,
                                        new ListNode(5,
                                            new ListNode(7)))))))));

        ListNode result = deleteDuplicates(head);

        while (result != null) {
            System.out.println(result.val + " ");
            result = result.next;
        }
    }
}
