package com.xufeiran.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int p=0, t=0, ans=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while (p < players.length && t < trainers.length) {
            if (players[p] <= trainers[t]) {
                p ++;
                t ++;
                ans ++;
            } else {
                t ++;
            }
        }
        return ans;
    }
}