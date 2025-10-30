package com.xufeiran.leetcode;

class Solution3005 {
    public static void main(String[] args) {
        int[] nums = {10, 12, 11, 9, 6, 19, 11};
        Solution3005 solution = new Solution3005();
        int i = solution.maxFrequencyElements(nums);
        System.out.println(i);
    }

    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int max = 0;
        for (int f : freq) {
            max = Math.max(max, f);
        }

        int time = 0;
        for (int f : freq) {
            if (f == max) {
                time++;
            }
        }
        return time * max;
    }
}