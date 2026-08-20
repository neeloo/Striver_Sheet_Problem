package org.example.Arrays;

import java.util.Arrays;

public class Set_Matrix_zero {
    public static void main(String[] args) {
        int mat[][]={{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZero(mat);
    }

    private static void setMatrixZero(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean fr =false;
        boolean fc = false;
        for(int i =0; i <n;i++){
            for( int j =0; j <m;j++){
                if(mat[i][j]==0){
                    if(i ==0)fr=true;
                    if(j==0)fc= true;
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for( int i =1;i<n;i++){
            for( int j =1;j<m;j++){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }
        if(fr){
            for( int j =0;j<m;j++){
                mat[0][j]=0;
            }
        }
        if(fc){
            for(int i =0; i <n;i++){
                mat[i][0]=0;
            }
        }
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }

    }
}
