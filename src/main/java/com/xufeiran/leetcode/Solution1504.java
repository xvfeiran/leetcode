package com.xufeiran.leetcode;

public class Solution1504 {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 1, 0}, {0, 1, 1, 1}, {1, 1, 1, 0}};
        Solution1504 solution = new Solution1504();
        int i = solution.numSubmat(mat);
        System.out.println(i);
    }

    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    if (i == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j] + 1;
                    }
                    int min = dp[i][j];
                    for (int k = j; k >= 0; k--) {
                        min = Math.min(min, dp[i][k]);
                        ans += min;
                    }
                }
            }
        }
        return ans;
    }
}
