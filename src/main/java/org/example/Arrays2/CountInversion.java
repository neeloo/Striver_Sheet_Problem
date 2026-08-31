package org.example.Arrays2;
import java.util.ArrayList;

public class CountInversion {
    public static void main(String[] args) {

        int arr[] = {2, 3, 7, 1, 3, 5};
        System.out.println(numberOfInversions(arr));
    }

    public static long numberOfInversions(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }

    public static long mergesort(int[] nums, int low, int high) {
        long cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergesort(nums, low, mid);
            cnt += mergesort(nums, mid + 1, high);
            cnt += merge(nums, low, mid, high);
        }
        return cnt;
    }

    static long merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        long cnt = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i++]);
            } else {
                temp.add(nums[j++]);
                cnt += (mid - i) + 1;
            }
        }

        while (i <= mid) temp.add(nums[i++]);
        while (j <= high) temp.add(nums[j++]);

        // FIX 1 & 2: Corrected loop boundaries and optimized array copying
        for (int n = low; n <= high; n++) {
            nums[n] = temp.get(n - low);
        }
        return cnt;
    }


}
