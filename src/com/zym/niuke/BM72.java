package com.zym.niuke;

public class BM72 {

    static void main() {
        int[] nums = {1, -2, 3, 10, -4, 7, 2, -5};
        int maxSum = new BM72().FindGreatestSumOfSubArray2(nums);
        System.out.println(maxSum);
    }

    public int FindGreatestSumOfSubArray2(int[] array) {
        //dp[i] 表示以元素array[i]结尾的数组的最大值
        //特别的 dp[0] = array[0]
        //dp[1] = max(array[1], dp[0] + array[1])
        //dp[2] = max(array[2], dp[1] + array[2])
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int maxSum = dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(array[i], dp[i - 1] + array[i]);
            if (dp[i] > maxSum) {
                maxSum = dp[i];
            }
        }
        return maxSum;
    }

    public int FindGreatestSumOfSubArray (int[] array) {
        //dp[l][r]表示索引l到r的子数组的和
        //特别的 dp[0][0] = array[0], dp[1][1] = array[1], ... dp[i][i] = array[i]
        //对于 dp[0][1] = dp[0][0] + dp[1][1], dp[0][2] = dp[0][1] + dp[2][2]
        //一般的 dp[l][r] = dp[l][l] + dp[r][r]
        int[][] dp = new int[array.length][array.length];

        int maxSum = array[0];
        for (int i = 0; i < array.length; i++) {
            dp[i][i] = array[i];
            if (dp[i][i] > maxSum) {
                maxSum = dp[i][i];
            }
        }

        for (int l = 0; l < array.length; l++) {
            for (int r = l + 1; r < array.length; r++) {
                dp[l][r] = dp[l][r - 1] + dp[r][r];
                if (dp[l][r] > maxSum) {
                    maxSum = dp[l][r];
                }
            }
        }

        return maxSum;
    }

}
