package Top75problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int ans[] = twoSum(arr , 9);
        System.out.println(Arrays.toString(ans));


    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                return new int[] { map.get(ans), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };

    }
}
