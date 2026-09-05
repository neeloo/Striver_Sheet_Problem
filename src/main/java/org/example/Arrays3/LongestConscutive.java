package org.example.Arrays3;

import java.util.HashSet;
import java.util.Set;

public class LongestConscutive {
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));

    }
    public static int longestConsecutive( int nums[]){
        Set<Integer> set = new HashSet<>();
        for( int num : nums){
            set.add(num);
        }
        int maxLength =0;
        for( int num : nums){
            if(!set.contains(num-1)){
                int curr = num ;
                int length =0;
                while(set.contains(curr)){
                    curr++;
                    length++;
                }
                maxLength = Math.max(maxLength , length);
            }
        }
        return maxLength;

    }
}
