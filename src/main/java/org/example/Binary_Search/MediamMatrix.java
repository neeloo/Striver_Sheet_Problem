package org.example.Binary_Search;

import java.util.Arrays;

public class MediamMatrix {
    public static void main(String[] args) {
        int m[][] = {{1, 4, 9}, {2, 5, 6}, {3, 7, 8}};
        System.out.println(findMedian(m));

    }
    public static int findMedian(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) return 0;

        int rows = m.length;
        int cols = m[0].length;
        int[] arr = new int[rows * cols];
        int k = 0;

        // Fixed: Added k++ to increment the index
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[k++] = m[i][j];
            }
        }
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            // Fixed: Correct indices for even length (average of two middle elements)
            return (arr[n / 2 - 1] + arr[n / 2]) / 2; // Use division if integer median is required
        }
    }


}
