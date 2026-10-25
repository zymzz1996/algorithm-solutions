package com.zym.niuke;

public class BM78 {

    public int rob (int[] nums) {
        //[10,2,3,40]
        //如果只有0一家，则只能偷第0家，即dp[0] = nums[0]
        //如果有0,1两家，则只能偷0或者1，也就是说最大收益是0或者1的较大者，dp[1] = Max(dp[0], nums[1])
        //如果有0,1,2三家，则可以选择0,2或者1，dp[2] = Max(dp[0] + nums[2], dp[1])
        //如果有0,1,2,3四家，则可以选择0,2或1,3或0,3，这可以抽象为两种情况，分别为要偷第四家和不偷第四家
        // dp[3] = Max(dp[1] + nums[3], dp[2])

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];

    }

}
