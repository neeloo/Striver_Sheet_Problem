package Top75problem;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive 1s: " + findMaxConsecutiveOnes(nums));
        // Output: 3

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                // Dynamically update the maximum streak found so far
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                // Reset the streak counter when encountering a 0
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
