package com.zym.niuke;

public class BM61 {

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int[][] matrix = {{1,2},{4,3}};
        int[][] matrix = {{4,3,3,6,6,3,2,1,0,7},{1,8,2,8,5,9,2,8,3,1},{8,0,9,2,4,3,2,4,3,7},{1,2,2,6,3,0,3,9,7,0},{7,4,3,8,8,3,2,4,6,8},{2,8,9,2,9,3,0,8,7,8},{8,9,9,4,6,3,3,4,9,6},{2,8,3,8,1,3,7,3,0,7},{2,1,1,6,4,1,0,8,1,6},{4,1,3,6,3,4,4,4,0,3}};
        int solve = new BM61().solve(matrix);
        System.out.println(solve);
    }

    public int solve (int[][] matrix) {
        //不需要考虑向左或向上走会走到走过的节点，因为一直都是向上走的（递增）
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, dfs(matrix, i, j, -1, 0));
            }
        }
        return max;
    }

    private int dfs(int[][] matrix, int i, int j, int before, int count) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return count;
        }
        if (matrix[i][j] <= before) {
            return count;
        }
        count++;
        int max = 0;
        max = Math.max(max, dfs(matrix, i, j + 1, matrix[i][j], count));
        max = Math.max(max, dfs(matrix, i + 1, j, matrix[i][j], count));
        max = Math.max(max, dfs(matrix, i, j - 1, matrix[i][j], count));
        max = Math.max(max, dfs(matrix, i - 1, j, matrix[i][j], count));
        return max;
    }
}
