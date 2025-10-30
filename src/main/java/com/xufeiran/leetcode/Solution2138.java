package com.xufeiran.leetcode;

class Solution2138 {
    public static void main(String[] args) {
        String s = "abcdefghi";
        int k = 3;
        char fill = 'x';
        Solution2138 solution = new Solution2138();
        String[] strings = solution.divideString(s, k, fill);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public String[] divideString(String s, int k, char fill) {
        int n = s.length() / k;
        if (s.length() % k != 0) {
            n++;
        }
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            int start = i * k;
            String sub;
            if (start + k <= s.length()) {
                sub = s.substring(start, start + k);
            } else {
                sub = s.substring(start);
                int fillNum = n * k - s.length();
                while (fillNum-- > 0) {
                    sub += fill;
                }
            }
            ans[i] = sub;
        }
        return ans;
    }
}