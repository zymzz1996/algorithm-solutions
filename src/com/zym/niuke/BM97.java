package com.zym.niuke;

import java.util.Arrays;

public class BM97 {

    public static void main(String[] args) {
        int[] a = {1, 2,3,4, 5,6};
        int[] solve = new BM97().solve(6, 4, a);
        System.out.println(Arrays.toString(solve));
    }

    public int[] solve (int n, int m, int[] a) {
        // [1, 2]
        // 1 1
        // 2 0
        // 3 1
        // 4 0
        m = m % n;
        reverse(0, n - 1, a);
        reverse(0, m - 1, a);
        reverse(m, n - 1, a);
        return a;
    }

    private void reverse(int start, int end, int[] a) {
        while (start < end) {
            int tmp = a[start];
            a[start] = a[end];
            a[end] = tmp;
            start++;
            end--;
        }
    }

}
