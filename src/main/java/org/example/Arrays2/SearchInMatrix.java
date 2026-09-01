package org.example.Arrays2;

public class SearchInMatrix {
    public static void main(String[] args) {

    }

        public static boolean searchMatrix(int[][] m, int k) {
            int row = m.length;
            int col = m[0].length;
            // top left conner
            int i = row - 1;
            int j = 0;
            while (i >= 0 && j < col) {
                if (m[i][j] == k) {
                    return true;
                }
                if (m[i][j] < k) {
                    j++;
                } else {
                    i--;
                }
            }
            return false;
        }


}
