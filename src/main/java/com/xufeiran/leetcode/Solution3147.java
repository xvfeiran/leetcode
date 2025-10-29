package com.xufeiran.leetcode;

class Solution3147 {
    public static void main(String[] args) {
        int[] energy = {-2, -3, -1};
        int k = 2;
        Solution3147 solution = new Solution3147();
        int i = solution.maximumEnergy(energy, k);
        System.out.println(i);
    }

    public int maximumEnergy(int[] energy, int k) {
        int max = energy[energy.length - 1];
        for (int i = 0; i <= k; i++) {
            int ans = 0;
            for (int j = i; j < energy.length; j += k) {
                if (ans + energy[j] < energy[j]) {
                    ans = energy[j];
                } else {
                    ans += energy[j];
                }
            }
            max = Math.max(max, ans);
        }
        return max;
    }
}