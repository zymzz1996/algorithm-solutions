package com.zym.niuke;

public class BM2 {

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
        ListNode node = new BM2().reverseBetween1(node1, 1, 4);
        System.out.println(node);
    }

    public ListNode reverseBetween1 (ListNode head, int m, int n) {

        int i = 1;
        ListNode cur = head;
        ListNode pre = null;
        ListNode nmPre = null;
        ListNode newHead = null;

        ListNode mCur = null;

        while (cur != null) {
            //如果元素数量超过1，那么就是需要翻转的，也就是说m != n
            if (i >= m && i <= n && m != n) {
                if (i == m) {
                    nmPre = new ListNode(cur.val);
                    mCur = nmPre;
                } else if (i == n) {
                    ListNode node = new ListNode(cur.val);
                    node.next = nmPre;
                    if (null == pre) {
                        newHead = node;
                    } else {
                        pre.next = node;
                    }
                    pre = mCur;
                } else {
                    ListNode node = new ListNode(cur.val);
                    node.next = nmPre;
                    nmPre = node;
                }
            } else {
                if (null == pre) {
                    pre = new ListNode(cur.val);
                    newHead = pre;
                } else {
                    pre.next = new ListNode(cur.val);
                    pre = pre.next;
                }
            }

            cur = cur.next;
            i++;
        }
        if (i == 1) {
            return head;
        }
        return newHead;
    }

    public ListNode reverseBetween (ListNode head, int m, int n) {
        int i = 1;

        ListNode cur = head;
        ListNode newM = null;
        ListNode newN = null;
        ListNode pre = null;
        ListNode after = null;
        ListNode newCur = null;

        while (cur != null) {
            if (i == m - 1) {
                pre = cur;
            }
            if (i == n + 1) {
                after = cur;
            }
            if (i == m) {
                newM = new ListNode(cur.val);
                newCur = newM;
            }
            if (i > m && i < n) {
                newCur.next = new ListNode(cur.val);
                newCur = newCur.next;
            }
            if (i == n) {
                newN = new ListNode(cur.val);
            }
            cur = cur.next;
            i++;
        }
        pre.next = newM;
        newN.next = after;

        return head;
    }

}
