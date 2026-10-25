package com.zym.niuke;

public class BM14 {

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
        ListNode res = new BM14().oddEvenList(node1);
        System.out.println(res);
    }

    public ListNode oddEvenList (ListNode head) {
        if (null == head) {
            return null;
        }
        // 1 2 3 4
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenFirst = even;
        //even != null && even.next != null
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenFirst;
        return head;
    }

}
