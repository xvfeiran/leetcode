package com.xufeiran.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Solution_ExampleTest {

    @Test
    void testTwoSum_found() {
        Solution_Example solution = new Solution_Example();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwoSum_notFound() {
        Solution_Example solution = new Solution_Example();
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] result = solution.twoSum(nums, target);

        assertEquals(0, result.length);
    }
}
