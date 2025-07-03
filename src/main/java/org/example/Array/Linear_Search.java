package org.example.Array;

public class Linear_Search {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,6,7}; int k=4;
        System.out.println(linearSearch(nums,k));
    }

    private static int linearSearch(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k)return i;
        }
        return -1;
    }
}
