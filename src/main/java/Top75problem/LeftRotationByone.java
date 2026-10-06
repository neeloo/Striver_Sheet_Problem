package Top75problem;

import java.util.Arrays;

public class LeftRotationByone {

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5}; ///3]	First 3 elements move to the back
        int ans[]= leftRotate(nums  ,3);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] leftRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handles cases where k is greater than array length

        reverse(nums, 0, k - 1); // Step 1: Reverse first k elements
        reverse(nums, k, n - 1); // Step 2: Reverse remaining elements
        reverse(nums, 0, n - 1); // Step 3: Reverse the whole array
        return nums;
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }


}
