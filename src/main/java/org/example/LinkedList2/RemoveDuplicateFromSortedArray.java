package org.example.LinkedList2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {

        public  static int removeDuplicates(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    continue;
                } else {
                    set.add(nums[i]);
                    nums[count] = nums[i];
                    count += 1;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int nums[]={0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicates(nums));
    }

}
