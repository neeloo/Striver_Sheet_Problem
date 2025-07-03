package org.example.Array;

public class Maximum_conscative_1s {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(maxConsutive(arr));
    }

    private static int maxConsutive(int[] arr) {
        int ans=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                left=right+1;
            }else{
                ans=Math.max(ans,right-left+1);
            }
        }
        return ans;
    }
}
