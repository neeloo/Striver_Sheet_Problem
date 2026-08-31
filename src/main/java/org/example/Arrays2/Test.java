package org.example.Arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[]={3, 5, 4, 1, 1};
        int ans [] = findMissingRepeatingNumbers(arr);
        System.out.println(Arrays.toString(ans));

    }
    // class Solution {
//     public int[] findMissingRepeatingNumbers(int[] nums) {
//         int[] ans = new int[2];
//         int n = nums.length;

//         Arrays.sort(nums);
//         // Find repeating number
//         for (int i = 0; i < n - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 ans[0] = nums[i];
//             }
//         }
//         // Find missing number
//         for (int i = 0; i < n; i++) {
//             if (nums[i] != i + 1) {
//                 ans[1] = i + 1;
//                 break;
//             }
//         }
//         return ans;
//     }
// }



        public static int[] findMissingRepeatingNumbers(int[] nums) {
            int n = nums.length;

            long expectedSum = (long) n * (n + 1) / 2;
            long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

            long actualSum = 0;
            long actualSquareSum = 0;

            for (int num : nums) {
                actualSum += num;
                actualSquareSum += (long) num * num;
            }
            // repeating(x) - missing(y)
            long diff = actualSum - expectedSum;  //x-y ---->equation-1
            // repeating² - missing²
            long squareDiff = actualSquareSum - expectedSquareSum; //x^2 - y^2= (x-y)(x+y)
            // repeating + missing
            long sum = squareDiff / diff; //x+y= (x^2-y^2)/(x-y) ----->equation-2

            long repeating = (diff + sum) / 2; // sum of equation1+equation2=value of x
            long missing = sum - repeating;

            return new int[]{(int) repeating, (int) missing};
        }

}
