package org.example.Array;

import java.util.Arrays;

public class Right_Roation_array_K_time {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotatedArry(arr,k);
    }

    private static void rotatedArry(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int s, int e) {
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        }
    }
}
