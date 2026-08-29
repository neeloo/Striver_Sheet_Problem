package org.example.Arrays2;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[]= {1,3,4,2,2};
        System.out.println(findDuplicate(arr));

    }
        public static int findDuplicate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int ind = Math.abs(nums[i]);
                if (nums[ind] < 0) {
                    return ind;
                }
                nums[ind] = -nums[ind];
            }
            return -1;
        }

}
