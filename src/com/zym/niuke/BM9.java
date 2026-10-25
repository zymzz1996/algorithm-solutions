package com.zym.niuke;

public class BM9 {

    public ListNode removeNthFromEnd (ListNode head, int n) {
        // 1,2 1   1 1   1,2 2
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        while (fast != null) {
            fast = fast.next;
            i++;
            if (i == n) {
                break;
            }
        }

        if (null == fast) {
            return head.next;
        }

        while (fast.next != null) {
            fast= fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }

}
