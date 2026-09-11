package org.example.LinkedList2;

public class MaxConsecutiveOnes {
    public  static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }

    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
