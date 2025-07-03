package org.example.Array;

public class First_missing_Integer {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        System.out.println(missinfNo(arr));
    }

    private static int missinfNo(int[] arr) {
        /// type 1
//        int n=arr.length; int s2=0;
//        int s1=n*(n+1)/2;
//        for(int i=0;i<arr.length;i++){
//            s2+=arr[i];
//        }
//        return s1-s2;

        /// //type2
//        int n = arr.length;
//        int ans = 0;
//        for (int i = 1; i <= n; i++) {
//            ans = ans ^ i;
//        }
//
//        for (int i = 0; i < n; i++) {
//            ans = ans ^ arr[i];
//        }
//        return ans;

        /// type3
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]>=1 && arr[i]<=n && arr[arr[i]-1] !=arr[i]){
                //swap(arr,arr[i]-1,i)
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
        int ans=0;
        for(int j=0;j<n;j++){
            if(arr[j] !=j+1){
                ans=(j+1);
                break;
            }
        }
        return ans;
    }
}
