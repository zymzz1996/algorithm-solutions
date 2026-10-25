package com.zym.niuke;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {7, 3, 2, 6, 0, 1, 5, 4};
        new MergeSort().mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public void mergeSort(int[] nums, int left, int right) {
        // 0 1
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);

    }

    public void merge(int[] nums, int left, int mid, int right) {
        //left到mid是有序的 mid+1到right是有序的
        int[] temp = new int[right + 1];
        int i1 = left;
        int i2 = mid + 1;
        for (int i = 0; i <= right - left; i++) {
            if (i1 > mid) {
                temp[i] = nums[i2++];
            } else if (i2 > right) {
                temp[i] = nums[i1++];
            } else if (nums[i1] > nums[i2]) {
                temp[i] = nums[i2++];
            } else {
                temp[i] = nums[i1++];
            }
        }
        for (int i = left; i <= right; i++) {
            nums[i] = temp[i - left];
        }
    }



}
