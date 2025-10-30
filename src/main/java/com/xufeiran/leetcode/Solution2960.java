package com.xufeiran.leetcode;

public class Solution2960 {
    public static void main(String[] args) {
        int[] batteryPercentages = {0, 1, 2};
        Solution2960 solution = new Solution2960();
        int i = solution.countTestedDevices(batteryPercentages);
        System.out.println(i);
    }

    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > ans) {
                ans++;
            }
        }
        return ans;
    }
}
