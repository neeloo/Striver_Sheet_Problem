package org.example.Array;

import java.util.Arrays;

public class Move_Zero_at_End {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        System.out.println(arr.length);
        movezero(arr);
    }

    private static void movezero(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
