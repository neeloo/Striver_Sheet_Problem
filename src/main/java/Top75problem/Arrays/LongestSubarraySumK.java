package Top75problem.Arrays;

import java.util.HashMap;
public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Length of longest subarray: " + longestSubarray(arr, k));
    }
    public static int longestSubarray(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // Map to store (prefixSum -> the earliest index where it occurred)
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            // Case 1: The subarray starts from index 0
            if (currentSum == k) {
                maxLength = i + 1;
            }
            // Case 2: Check if (currentSum - k) has been seen before
            if (map.containsKey(currentSum - k)) {
                int oldIndex = map.get(currentSum - k);
                maxLength = Math.max(maxLength, i - oldIndex);
            }
            // Crucial: Only store the prefixSum if it hasn't been seen before.
            // This guarantees we keep the EARLIEST index to maximize the subarray length.
            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }
        return maxLength;
    }
}
