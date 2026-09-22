package org.example.DP;

public class Stairs {
    public static void main(String[] args) {
        int n = 3; ///(1,1,1) , (1,2),(2,1)
        System.out.println(stairs(n));
        System.out.println(bottomUp(n));

    }
    public static int stairs(int n) {
        if (n == 0 || n == 1) return 1;
        return stairs(n - 1) + stairs(n - 2);
    }
    public  static  int bottomUp(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
