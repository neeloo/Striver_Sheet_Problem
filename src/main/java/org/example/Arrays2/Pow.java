package org.example.Arrays2;

public class Pow {
    public static void main(String[] args) {
        double  x = 2.00000; int  n = 10;
        System.out.println(myPow(x ,n));

    }
    public static double myPow(double x, int n) {
        long N = n;
        double ans = solve(x, Math.abs(N));
        if (N < 0) {
            return 1 / ans;
        }
        return ans;
    }

    public static double solve(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double temp = solve(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;

        }
    }
}
