package org.example.DP;

import java.util.Arrays;

class FrogJump {
    public int frogJump(int[] heights) {
        int n = heights.length;
        int dp[] = new int[heights.length + 1];
        Arrays.fill(dp, -1);

        return minCostMemo(n - 1, heights, dp);

    }

    public static int minCostMemo(int n, int[] heights, int dp[]) {
        if (n == 0) return 0;
        // If there are only 2 stairs(0-based
        // index), then frog can only take 
        // jump of size one
        if (n == 1)
            return Math.abs(heights[n] - heights[n - 1]);

        // if the result for this subproblem is 
        // already computed then return it
        if (dp[n] != -1) return dp[n];

        dp[n] = Math.min(minCostMemo(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]),
                minCostMemo(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]));

        return dp[n];
    }
}