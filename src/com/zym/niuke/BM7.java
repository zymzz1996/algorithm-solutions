package com.zym.niuke;

import java.util.HashSet;

public class BM7 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode cur = pHead;
        while (cur != null) {
            if (set.contains(cur)) {
                return cur;
            }
            set.add(cur);
            cur = cur.next;
        }
        return null;
    }

    public ListNode EntryNodeOfLoop1(ListNode pHead) {
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        //证明没环
        if (fast == null || fast.next == null) {
            return null;
        }
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
