package org.example.Binary_Search;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        System.out.println(search(arr, k));

    }

    public static int search(int[] nums, int k) {

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == k) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= k && k <= nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] <= k && k <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
