package com.zym.niuke;

import java.util.ArrayList;
import java.util.List;

public class BM13 {

    public boolean isPail (ListNode head) {
        if (null == head) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
