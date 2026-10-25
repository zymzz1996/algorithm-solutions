package com.zym.niuke;

public class BM16 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        ListNode res = new BM16().deleteDuplicates(node1);
        System.out.println(res);

    }

    public ListNode deleteDuplicates (ListNode head) {
        // 1 2 2 3 // 1 2 3 3 // 1 1 2 3
        // 1 1 2 2 // 1 1 1 // 1 1 // 1

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode cur = head;
        ListNode temp = dummyNode;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                temp.next = cur.next;
                cur = cur.next;
            } else {
                //temp移动的原则是当后一个元素和当前的不相等时，证明当前元素是唯一的，此时temp指向当前元素
                temp = cur;
                cur = cur.next;
            }
        }

        return dummyNode.next;
    }

}
