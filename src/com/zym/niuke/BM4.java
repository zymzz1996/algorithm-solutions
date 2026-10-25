package com.zym.niuke;

public class BM4 {

    public ListNode Merge (ListNode pHead1, ListNode pHead2) {
        ListNode newHead = null;
        ListNode pre = null;
        while (pHead1 != null || pHead2 != null) {
            //筛选两个节点中的小值
            ListNode node = new ListNode(pHead1 != null  && pHead2 != null ? Math.min(pHead1.val,  pHead2.val) : pHead1 != null ?  pHead1.val : pHead2.val);
            if (pre != null) {
                pre.next = node;
            }
            if (newHead == null) {
                newHead = node;
            }
            pre = node;

            //移动小值的指针到 next
            if (pHead1 != null  && pHead2 != null) {
                if (pHead1.val < pHead2.val) {
                    pHead1 = pHead1.next;
                } else {
                    pHead2 = pHead2.next;
                }
            } else {
                if (pHead1 != null) {
                    pHead1 = pHead1.next;
                }
                if (pHead2 != null) {
                    pHead2 = pHead2.next;
                }
            }
        }
        return newHead;
    }

}
