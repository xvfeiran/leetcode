package com.xufeiran.leetcode;

public class Solution1526 {
    public static void main(String[] args) {
        int[] target = {3, 1, 1, 2};
        Solution1526 solution = new Solution1526();
        int i = solution.minNumberOperations(target);
        System.out.println(i);
    }

    public int minNumberOperations(int[] target) {
        int n = target.length;
        int ans = target[0];
        for (int i = 1; i < n; ++i) {
            ans += Math.max(target[i] - target[i - 1], 0);
        }
        return ans;
    }
}
