package org.example.Arrays;

public class Pascal_triangleI {
    public static void main(String[] args) {
        int r =4;int c=2;
        System.out.println(pascalTriangleI(r ,c));

    }
    public static int pascalTriangleI(int r, int c) {
        int n = r-1;
        int m = c-1;
        int ans =1;
        for( int i =0; i<m;i++){
            ans *= (n-i);
            ans /= (i+1);
        }
        return ans;

    }
}
