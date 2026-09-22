package org.example.DP;

public class Stairs {
    public static void main(String[] args) {
        int n = 3; ///(1,1,1) , (1,2),(2,1)
        System.out.println(stairs(n));

    }

    public static int stairs(int n) {
        if (n == 0 || n == 1) return 1;
        return stairs(n - 1) + stairs(n - 2);
    }
}
