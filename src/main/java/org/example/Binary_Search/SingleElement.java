package org.example.Binary_Search;

public class SingleElement {
    public static void main(String[] args) {
        int nums[]={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(findSingleElement(nums));

    }
    public static int findSingleElement(int arr[]){
        int xor =0;
        for( int a:arr){
            xor ^= a;
        }
        return xor;
    }
}
