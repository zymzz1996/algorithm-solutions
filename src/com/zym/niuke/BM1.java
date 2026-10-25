package com.zym.niuke;

public class BM1 {

    public ListNode ReverseList (ListNode head) {
        //使用一个新指针
        ListNode newHead = null;
        while (head != null) {
            //先保存新指针当前的指向
            ListNode temp = newHead;
            //再把新指针指向当前遍历的节点
            newHead = new ListNode(head.val);
            //
            newHead.next = temp;
            head = head.next;
        }
        return newHead;
    }

}
