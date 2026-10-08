package Top75problem;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        int ans[] = sortZero(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortZero(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
