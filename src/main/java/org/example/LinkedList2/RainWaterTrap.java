package org.example.LinkedList2;

public class RainWaterTrap {
    public static void main(String[] args) {
        int nums[]= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(nums));
    }

        public static int trap(int[] nums) {
            int n = nums.length;
            // int l[]=new int[n];
            // int r[]=new int[n];
            // l[0]=nums[0];
            // for( int i =1;i<n;i++){
            //     l[i]= Math.max(nums[i] , l[i-1]);
            // }
            // r[n-1]= nums[n-1];
            // for( int i = n-2;i>=0;i--){
            //     r[i]=Math.max(nums[i] , r[i+1]);
            // }
            // int count =0;
            // for( int i =0; i<n;i++){
            //     count += Math.min(l[i] , r[i])-nums[i];
            // }
            // return count;

            int l =0; int r= n-1;
            int lmax =0;int rmax =0;
            int ans =0;
            while(l<r){
                lmax =Math.max(lmax , nums[l]);
                rmax= Math.max(rmax , nums[r]);
                if(lmax < rmax){
                    ans += lmax-nums[l];
                    l++;
                }
                else {
                    ans += rmax - nums[r];
                    r--;
                }
            }
            return ans;
        }


}
