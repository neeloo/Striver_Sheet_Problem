package org.example.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayToSumKWithXOR {
    public static void main(String[] args) {
        int nums[]={4, 2, 2, 6, 4};int k =6;
        System.out.println(countSubarray(nums , k));

    }
    public static int countSubarray( int nums[] , int k){
        Map<Integer,Integer> map = new HashMap<>();
        int cnt =0;
        int pf =0;
        map.put(0 , 1);
        for( int num : nums){
            pf ^= num;
            int target = pf ^ k;
            cnt += map.getOrDefault(target , 0);
            map.put(pf , map.getOrDefault(pf , 0)+1);
        }
        return cnt;
    }
}
