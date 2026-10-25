package com.zym.niuke;

public class BM67 {

    public int uniquePaths (int m, int n) {
        //递推2*2大小的地图
        //dp[m][n]表示m*n大小的地图的路径数
        //特殊的： dp[1][1] = 1
        //递推边界：dp[1][2] = 1 dp[2][1] = 1 即所有的dp[1][n] 和 dp[m][1]都是1
        //dp[2][2] = 2 即：dp[2][2] = dp[1][2] + dp[2][1]
        //一般的：dp[m][n] = dp[m-1][n] + dp[m][n-1]
        if (m == 1 && n == 1) {
            return 1;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 2; i < n + 1; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i < m + 1; i++) {
            dp[i][1] = 1;
        }
        for (int i = 2; i < m + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m][n];
    }

}
