package org.example.Array;

import java.util.Arrays;

public class Left_Roation_Array_K_time {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};   ///3,4,5,6,1,2
        int k=2;
        leftRoation(arr,k);
    }

    private static void leftRoation(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        reverseArry(arr,0,k-1);
        reverseArry(arr,k,n-1);
        reverseArry(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArry(int[] arr, int s, int e) {
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }
}
