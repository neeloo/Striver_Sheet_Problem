package Top75problem.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        // Step 1: Find potential candidates
        Integer candidate1 = null, candidate2 = null;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            // Check if the current number matches candidate1
            if (candidate1 != null && num == candidate1) {
                count1++;
            }
            // Check if the current number matches candidate2
            else if (candidate2 != null && num == candidate2) {
                count2++;
            }
            // Establish candidate1 if the slot is empty
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            // Establish candidate2 if the slot is empty
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            // If it matches neither candidate and slots are full, use your ternary lines
            else {
                count1 += (num == candidate1) ? 1 : -1;
                count2 += (num == candidate2) ? 1 : -1;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            }
        }

        int n = nums.length;
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 3};
        System.out.println(majorityElement(test1)); // Output: [3]

        int[] test2 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(majorityElement(test2)); // Output: [1, 2]
    }
}
