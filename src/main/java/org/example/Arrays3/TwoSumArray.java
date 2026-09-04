package org.example.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> map = new HashMap<>();
        for( int i=0;i<nums.length;i++){
            int contains = target - nums[i];
            if( map.containsKey(contains)){
                return new int[]{map.get(contains) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{-1,-1};

    }
}
