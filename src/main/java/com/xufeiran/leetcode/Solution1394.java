package com.xufeiran.leetcode;

class Solution1394 {
    public int findLucky(int[] arr) {
        int[] bucket = new int[501];
        for (int a : arr) {
            bucket[a]++;
        }
        int ans = -1;
        for (int i = 1; i < bucket.length; i++) {
            if (i == bucket[i]) {
                ans = i;
            }
        }
        return ans;
    }
}