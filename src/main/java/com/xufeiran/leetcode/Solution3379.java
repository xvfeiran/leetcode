package com.xufeiran.leetcode;

public class Solution3379 {
    public static void main(String[] args) {
        int[] nums = {-1, 4, -1};
        Solution3379 solution = new Solution3379();
        int[] ints = solution.constructTransformedArray(nums);
        StringBuilder sb = new StringBuilder();
        for (int i : ints) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    public int[] constructTransformedArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = i + nums[i];
            while (idx < 0) {
                idx += nums.length;
            }
            if (idx > nums.length - 1) {
                idx = idx % nums.length;
            }
            ans[i] = nums[idx];
        }
        return ans;
    }
}
