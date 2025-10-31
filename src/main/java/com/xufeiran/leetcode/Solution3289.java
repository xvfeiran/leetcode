package com.xufeiran.leetcode;

class Solution3289 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        Solution3289 solution = new Solution3289();
        int[] sneakyNumbers = solution.getSneakyNumbers(nums);
        System.out.println(sneakyNumbers[0] + " " + sneakyNumbers[1]);
    }

    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int[] bucket = new int[nums.length];
        for (int n : nums) {
            bucket[n]++;
        }
        for (int i = 1; i < bucket.length; i++) {
            if (bucket[i] == 2) {
                if (ans[0] == 0) {
                    ans[0] = i;
                } else {
                    ans[1] = i;
                    break;
                }
            }
        }
        return ans;
    }
}