package org.example.Array;

import java.util.HashSet;
import java.util.Set;

public class remove_Duplicate {
    public static void main(String[] args) {
        int arr[] = {-2, 2, 4, 4, 4, 4, 5, 5};
        System.out.println(removeDuplicate(arr));
    }

    private static int removeDuplicate(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for(int num:arr){
//            set.add(num);
//        }
//        return set.size();

        /*
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            } else {
                set.add(nums[i]);
                nums[count++] = nums[i];

            }
        }
        return count;
        */

        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j++]=nums[i];
            }
        }return j;
    }


}
