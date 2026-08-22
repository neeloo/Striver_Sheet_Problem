package org.example.Arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotatedMatrix90 {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(arr);

    }

        public  static void rotateMatrix(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            for(int i=0;i<n;i++){
                for( int j =i+1;j<m;j++){
                    int temp= matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            for( int i =0; i <n;i++){
                int l = 0;
                int r= n-1;
                while(l<r){
                    int temp = matrix[i][l];
                    matrix[i][l]=matrix[i][r];
                    matrix[i][r]=temp;
                    l++;
                    r--;
                }
            }
            for( int a[]:matrix){
                System.out.println(Arrays.toString(a));
            }


    }

}
