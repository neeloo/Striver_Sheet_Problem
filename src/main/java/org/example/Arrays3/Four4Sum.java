package org.example.Arrays3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four4Sum {
    public static void main(String[] args) {
        int nums[] = {1, -2, 3, 5, 7, 9};
        int k = 7;
        List<List<Integer>> list = fourSum(nums, k);
        System.out.println(list);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates for the first number
            if ((i - 1 >= 0) && nums[i - 1] == nums[i]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                // Skip duplicates for the second number
                if ((j - 1 != i) && (nums[j - 1] == nums[j])) continue;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    // Use long to avoid integer overflow
                    long acquiredNum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    if (acquiredNum < target) {
                        left++;
                    } else if (acquiredNum > target) {
                        right--;
                    } else {
                        answer.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Skip duplicates for the third number
                        while ((left < right) && (nums[left + 1] == nums[left])) {
                            left++;
                        }
                        // Skip duplicates for the fourth number
                        while ((left < right) && (nums[right - 1] == nums[right])) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return answer;
    }

}
