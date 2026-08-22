package org.example.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int arr[] = {3, 8, 1, 4, 6, 2};
        System.out.println(stockBuySell(arr , arr.length));

    }

        public static int stockBuySell(int[] arr, int n) {
            int p =0;
            int minP = arr[0];
            for( int  i =0; i <n;i++){
                minP = Math.min(arr[i],minP);
                p =Math.max(p,arr[i]-minP);
            }
            return p;

        }

}
