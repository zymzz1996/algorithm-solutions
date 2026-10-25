package com.zym.niuke;

public class BM3 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = new BM3().reverseKGroup(node1, 2);
        System.out.println(res);
    }

    public ListNode reverseKGroup (ListNode head, int k) {
        //用于检测剩余是否满足k个元素
        ListNode c = head;
        int j = 0;
        while (c != null) {
            j++;
            c = c.next;
        }
        if (j < k) {
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;

        for (int i = 0; i < k; i++) {
            if (cur != null) {
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
        }

        //剩余部分
        ListNode left = reverseKGroup(cur, k);
        head.next = left;

        return pre;

    }

}
