package Top75problem.Arrays;

import java.util.HashMap;

public class SubarraySumCount {
    public static int countSubarraysWithSumK(int[] arr, int k) {
        // Map to store (prefix_sum -> total_occurrences_frequency)
        HashMap<Integer, Integer> map = new HashMap<>();
        // Base case: A prefix sum of 0 has occurred 1 time (before starting the array)
        map.put(0, 1);
        int currentSum = 0;
        int count = 0;
        for (int j : arr) {
            currentSum += j;
            // If (currentSum - k) exists in the map, it means we found 
            // subarrays ending at index 'i' that sum up to k
            int rem = currentSum - k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            // Record or update the frequency of the current prefix sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        
        int result = countSubarraysWithSumK(arr, k);
        System.out.println("Total subarrays with sum " + k + " is: " + result); 
        // Output: 3
    }
}
