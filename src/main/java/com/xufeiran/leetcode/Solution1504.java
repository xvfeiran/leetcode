package com.xufeiran.leetcode;

// TODO
public class Solution1504 {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 1, 0}, {0, 1, 1, 1}, {1, 1, 1, 0}};
        Solution1504 solution = new Solution1504();
        int i = solution.numSubmat(mat);
        System.out.println(i);
    }

    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][][] dp = new int[m][n][2];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = new int[]{0, 0};
                } else {
                    int x, y;
                    if (i == 0 && j == 0) {
                        x = 0;
                        y = 0;
                    } else if (i == 0) {
                        x = 1;
                        y = dp[i][j - 1][1] + 1;
                    } else if (j == 0) {
                        x = dp[i - 1][j][0] + 1;
                        y = 1;
                    } else {
                        x = Math.min(dp[i][j - 1][0], dp[i - 1][j][0] + 1);
                        y = Math.min(dp[i - 1][j][1], dp[i][j - 1][1] + 1);
                    }
                    dp[i][j] = new int[]{x, y};
                }
                ans += dp[i][j][0] * dp[i][j][1];
            }
        }
        return ans;
    }
}
