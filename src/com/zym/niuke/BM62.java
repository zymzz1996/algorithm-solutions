package com.zym.niuke;

public class BM62 {

    static void main() {

    }

    public int Fibonacci (int n) {
        if (n == 1 ||  n == 2) {
            return 1;
        }
        //可优化点：可以只用三个变量
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

}
