package Top75problem;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int nums[]={7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(nums));
    }
    private static int bestTime(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

//        int profit = 0;
//        int minSum = nums[0];
//
//        for(int num : nums){
//            if (num < minSum) {
//                minSum = num;
//            }
//            int currSum = num - minSum;
//            if (currSum > profit) {
//                profit = currSum;
//            }
//        }
//        return profit;

        int profit = 0;
        int minProfit = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            minProfit = Math.min(nums[i] , minProfit);
            profit = Math.max( profit , nums[i] - minProfit);
        }
        return profit;

    }
}
