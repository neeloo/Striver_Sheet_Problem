package org.example.Array;

import java.util.HashMap;
public class Longest_subarray_with_Ksum {
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(longestSubarray(arr,k));
    }

    public static int longestSubarray(int[] nums, int k) {
//        int maxLen = 0;
//        int n = nums.length;
//       /// carry forward approach
//        for (int start = 0; start < n; start++) {
//            int sum = 0;
//            for (int end = start; end < n; end++) {
//                sum += nums[end];
//                if (sum == k) {
//                    maxLen = Math.max(maxLen, end - start + 1);
//                }
//            }
//        }
      //  return maxLen;

/// solve us eof map
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            // Case 1: If prefixSum itself is equal to k
            if (prefixSum == k) {
                maxLength = i + 1;
            }

            // Case 2: If (prefixSum - k) seen before
            if (map.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum - k));
            }

            // Case 3: Store first occurrence of prefixSum
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;

    }
}
