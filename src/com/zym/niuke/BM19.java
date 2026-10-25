package com.zym.niuke;

public class BM19 {

    public int findPeakElement (int[] nums) {
        // 1 2 1 3 1
        // 1 2 3 2 1
        // 1 2 1 2
        // 1 2
        // 1
        // 2 1
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;

    }

}
