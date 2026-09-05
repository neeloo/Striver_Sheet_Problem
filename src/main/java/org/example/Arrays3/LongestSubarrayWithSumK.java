package org.example.Arrays3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(logestSubarray(nums, k));
    }

    public static int logestSubarray(int nums[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLength = Math.max(maxLength, len);
            }
            map.put(sum, i);
        }
        return maxLength;
    }
}
