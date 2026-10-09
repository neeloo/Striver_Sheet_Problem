package Top75problem;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(nums));
    }

    private static int maximumSubarray(int[] nums) {
        int currSum =nums[0];
        int maxSum =nums[0];
        for(int num :nums){
            currSum += num;
            maxSum = Math.max(maxSum , currSum);
            if(currSum <0){
                currSum =0;
            }
        }
        return maxSum;
    }
}
