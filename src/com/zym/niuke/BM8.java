package com.zym.niuke;

public class BM8 {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        //可以考虑使用快慢指针，两个指针之间差k，这样在快指针到达末尾时，慢指针所指就是倒数第k个
        // 长度10 k值3 正数为7
        int length = 0;
        ListNode temp1 = pHead;
        while (temp1 != null) {
            length++;
            temp1 = temp1.next;
        }
        int i = length - k;
        if (i < 0) {
            return null;
        }
        ListNode temp2 = pHead;
        int j = 0;
        while (temp2 != null) {
            if (j == i) {
                return temp2;
            }
            j++;
            temp2 = temp2.next;

        }
        return null;
    }

}
