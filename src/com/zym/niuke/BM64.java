package com.zym.niuke;

public class BM64 {

    static void main() {
        int[] dp = new int[2];
        System.out.println(dp[1]);
    }

    public int minCostClimbingStairs (int[] cost) {
        // 对于第2层，可以从0或者1爬上来，需要的费用是cost[0]或者cost[1]
        // 对于第3层，可以从1或者2爬上来，第1层花费cost[1] + 到达第1层的费用dp[1](第1层是起跳点，到达第1层没有费用)，第2层花费cost[2] + 到达第2层的费用dp[2]
        // 取这两种方式的最小值，也就是到达第3层的最低成本

        int[] dp = new int[cost.length + 1];
        //从第0位置到达顶层的最小花费
        dp[0] = 0;
        dp[1] = 0;
//        dp[2] = Math.min(dp[0] + cost[0], dp[1] + cost[1]);
//        dp[3] = Math.min(dp[1] + cost[1], dp[2] + cost[2]);

        for (int i = 2; i < cost.length + 1; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }

        return dp[cost.length];

    }

}
