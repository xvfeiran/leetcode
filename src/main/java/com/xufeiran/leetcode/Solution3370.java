package com.xufeiran.leetcode;

class Solution3370 {
    public int smallestNumber(int n) {
        int m = 2;
        while (n >= m) {
            m *= 2;
        }
        return m - 1;
    }
}
