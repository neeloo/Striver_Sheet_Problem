package org.example.Array;

import java.util.Arrays;

public class Left_Roation_One_time {
    public static void main(String[] args) {
        int arr[]={-1, 0, 3, 6};  ///0,3,6,-1
        rotateArrayByOne(arr);
    }
    public  static void rotateArrayByOne(int[] nums) {
        int n=nums.length;
        int k=1;
        k=k%n;
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
        reverseArray(nums,0,n-1);
        System.out.println(Arrays.toString(nums));

    }
    public static void reverseArray(int[] arr ,int start,int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
