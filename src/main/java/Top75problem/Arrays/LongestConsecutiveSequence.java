package Top75problem.Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Step 1: Insert all unique elements into a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;
        // Step 2: Iterate through the array to find the start of a sequence
        for (int num : set) {
            // Check if 'num' is the starting element of a sequence
            // If (num - 1) is present, then 'num' is NOT the start
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // Expand the sequence upwards
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                // Update the maximum length found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + result);
        // Output: 4 (The sequence is)
    }
}
