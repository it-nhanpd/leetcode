package linkedlist;

import common.ListNode;

public class leetcode_21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    public static void main(String[] args){
        ListNode list1 =
            new ListNode(1,
                new ListNode(2,
                    new ListNode(4)));
        
        ListNode list2 =
            new ListNode(1,
                new ListNode(4,
                    new ListNode(4)));

        ListNode dummy = mergeTwoLists(list1, list2); 
        while(dummy != null){
            System.out.println(dummy.val);
            dummy = dummy.next;
        }

    } 
}
