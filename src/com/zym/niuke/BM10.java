package com.zym.niuke;

public class BM10 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //假设第一个链表长度为3，第二个链表长度为5，假设他们倒数2个节点是相同节点
        //此时如果把两个链表的末尾对齐，可以预见的是他们的头对不齐
        //所以就是要想办法把头对齐，我们可以巧妙的发现虽然两个链表的长度不一致，但是他们加起来的长度是一致的
        //也就是说，3 + 5 = 5 + 3，这样子头就对齐了，只要同步往后走，一定会走到第一个一致的节点

        ListNode cursor1 = pHead1;
        ListNode cursor2 = pHead2;

        boolean hasChanged1 = true;
        boolean hasChanged2 = true;
        while (cursor1 != null && cursor2 != null) {
            if (cursor1 == cursor2) {
                return cursor1;
            }
            if (cursor1.next != null) {
                cursor1 = cursor1.next;
            } else if (hasChanged1) {
                cursor1 = pHead2;
                hasChanged1 = false;
            } else {
                cursor1 = null;
            }
            if (cursor2.next != null) {
                cursor2 = cursor2.next;
            } else if (hasChanged2) {
                cursor2 = pHead1;
                hasChanged2 = false;
            } else {
                cursor2 = null;
            }
        }

        return null;
    }

}
