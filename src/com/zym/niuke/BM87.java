package com.zym.niuke;

import java.util.Arrays;

public class BM87 {

    public static void main(String[] args) {
        int[] A = {4, 5, 6, 0, 0, 0};
        int[] B = {1, 2, 3};
        new BM87().merge(A, 3, B, 3);
        System.out.println(Arrays.toString(A));

    }

    public void merge(int A[], int m, int B[], int n) {
        int i = 0, j = 0;
        while (i < m + n && j < n) {
            //假设A中当前的所有元素比B小，需要把B的数据负载A的元素后
            if (i >= m + j) {
                A[i] = B[j];
                j++;
                i++;
            }
            //A当前位置比B小，则跳过
            else if (A[i] < B[j]) {
                i++;
            }
            //A当前位置比B大，则把B的元素移到A的当前位置，同时A中的元素同步往后移动
            else {
                int cur = A[i];
                for (int k = i; k < m + n; k++) {
                    if (k + 1 < m + n) {
                        int temp = A[k + 1];
                        A[k + 1] = cur;
                        cur = temp;
                    }
                }
                A[i] = B[j];
                j++;
                i++;
            }
        }
    }

}
