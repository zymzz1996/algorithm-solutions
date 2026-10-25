package com.zym.niuke;

public class BM6 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean res = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                res = true;
                break;
            }
        }

        return res;
    }

}
