package com.zym.niuke;

import java.util.ArrayList;
import java.util.Collections;

public class BM12 {

    public ListNode sortInList (ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        ListNode dummyNode = new ListNode(-1);
        cur = dummyNode;
        for (Integer val : list) {
            ListNode node = new ListNode(val);
            cur.next = node;
            cur = cur.next;
        }
        return dummyNode.next;
    }

}
