package org.example.Arrays2;

public class uniquePathMatrix {

        public int uniquePaths(int n, int m) {
            int dp[][] = new int[n][m];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i == n - 1 && j == m - 1) {
                        dp[i][j] = 1; // destination
                    } else {
                        int down = (i + 1 < n) ? dp[i + 1][j] : 0;
                        int right = (j + 1 < m) ? dp[i][j + 1] : 0;
                        dp[i][j] = down + right;
                    }
                }
            }
            return dp[0][0];
        }

}
