package com.zym.niuke;

public class BM11 {

    public ListNode addInList (ListNode head1, ListNode head2) {
        ListNode h1 = reverse(head1);
        ListNode h2 = reverse(head2);
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        int temp = 0;
        while (h1 != null || h2 != null) {
            int val = temp;
            if (h1 != null && h2 != null) {
                val = val + h1.val + h2.val;
            } else if (h1 != null) {
                val = val + h1.val;
            } else {
                val = val + h2.val;
            }
            temp = val / 10;

            cur.next = new ListNode(val % 10);
            cur = cur.next;

            if (h1 != null) {
                h1 = h1.next;
            }
            if (h2 != null) {
                h2 = h2.next;
            }
        }
        if (temp != 0) {
            cur.next = new ListNode(temp);
        }

        return reverse(dummyNode.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
