package linkedlist;

import common.ListNode;

public class leetcode_141 {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Tạo danh sách: 1 -> 4 -> 4 -> null
        // ListNode head = new ListNode(1,
        // new ListNode(4,
        // new ListNode(4)));
        // Bước 1: Khởi tạo nút đầu tiên độc lập
        ListNode head = new ListNode(1);

        // Bước 2: Tạo phần còn lại lồng nhau, nút cuối tạm thời trỏ vào null (1 -> 4 ->
        // 5 -> null)
        head.next = new ListNode(4,
                new ListNode(5));

        // Bước 3: Tìm nút cuối cùng và nối ngược về head để tạo chu kỳ
        ListNode lastNode = head.next.next;
        lastNode.next = head; // Tạo chu kỳ: 5 trỏ về 1

        boolean dummy = hasCycle(head);
        System.out.println(dummy);

    }
}
