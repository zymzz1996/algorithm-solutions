package com.zym.niuke;

public class BM21 {

    static void main() {
        int[] nums = {1,0,1,1,1};
        int i = new BM21().minNumberInRotateArray(nums);
        System.out.println(i);
    }

    public int minNumberInRotateArray(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        int mid = (l + r) / 2;

        while (l < r) {
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                r--;
            }
            mid = (l + r) / 2;
        }

        return nums[mid];
    }

}
