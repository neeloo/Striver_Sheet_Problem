package org.example.Binary_Search;

import java.util.Arrays;

public class AggrasiveCows {
    public static void main(String[] args) {
        int a[]={0, 3, 4, 7, 10, 9};int k =4;
        System.out.println(aggressiveCows(a ,k));

    }
    public static int aggressiveCows(int[] A, int B) {
        Arrays.sort(A);
        //  B=number of cows;  find the distance
        int n=A.length;
        int l = 0;
        int r = A[n-1]-A[0];
        int ans = 0;
        while(l <= r){
            int mid = l+(r-l)/2;
            int cnt=countCows(A,mid);
            if(cnt>=B && countCows(A,mid+1)<B){
                ans= mid;
            }if(cnt<B) {
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public  static int    countCows(int A[],int D){
        int c=1;int last=A[0];
        for(int i=1;i<A.length;i++){
            if((A[i]-last)>=D){
                c++;
                last=A[i];
            }
        }
        return c;
    }
}
