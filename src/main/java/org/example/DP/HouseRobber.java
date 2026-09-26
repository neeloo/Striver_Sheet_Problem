package org.example.DP;

import java.util.Arrays;

class HouseRobber {
    public int houseRobber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        // Scenario 1: Rob from house 0 to n-2 (exclude last)
        int[] memo1 = new int[nums.length];
        Arrays.fill(memo1, -1);
        int max1 = robMemo(nums, nums.length - 2, 0, memo1);

        // Scenario 2: Rob from house 1 to n-1 (exclude first)
        int[] memo2 = new int[nums.length];
        Arrays.fill(memo2, -1);
        int max2 = robMemo(nums, nums.length - 1, 1, memo2);

        return Math.max(max1, max2);
    }

    private int robMemo(int[] nums, int i, int start, int[] memo) {
        // Base case: If we pass the starting house boundary
        if (i < start) return 0;

        // Return cached result if already calculated
        if (memo[i] != -1) return memo[i];

        // Choice 1: Rob current house 'i' + rob from house 'i-2'
        int robCurrent = nums[i] + robMemo(nums, i - 2, start, memo);

        // Choice 2: Skip current house 'i' + rob from house 'i-1'
        int skipCurrent = robMemo(nums, i - 1, start, memo);

        // Cache and return the maximum of both choices
        memo[i] = Math.max(robCurrent, skipCurrent);
        return memo[i];
    }
}
