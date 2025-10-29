package com.xufeiran.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 示例题：给定一个整数数组 nums 和一个整数 target，
 * 请你在该数组中找出和为 target 的两个整数，并返回它们的下标。
 */
public class Solution_Example {

    /**
     * 示例方法：找到两数之和
     *
     * @param nums   输入的整数数组
     * @param target 目标和
     * @return 两个数的下标数组，如果不存在则返回空数组
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0]; // 没找到
    }
}
