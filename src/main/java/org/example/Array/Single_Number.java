package org.example.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Single_Number {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 4, 3, 1, 4};
        System.out.println(singleNo(arr));
    }

    private static int singleNo(int[] arr) {
        int k=0;
        for(int num:arr){
            k^=num;
        }
        return k;

//        Map<Integer,Integer> map=new HashMap<>();
//        for(int num:arr){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        int ans=0;
//        for(int i:arr){
//            if(map.get(i)==1){
//                ans=i;
//                break;
//            }
//        }return ans;


    }
}
