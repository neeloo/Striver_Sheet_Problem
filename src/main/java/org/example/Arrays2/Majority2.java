package org.example.Arrays2;

import java.util.*;

public class Majority2 {
    public static <Intgeer> void main(String[] args) {
        int arr[]= {1, 2, 1, 1, 3, 2};
        List<Integer>list = majorityElementTwo(arr);
        System.out.println(list);


    }

    public static List<Integer> majorityElementTwo(int[] nums) {
        int n = nums.length;
        int m1 = 0;
        int m2 = 0;
        int f1 = 0;
        int f2 = 0;
        // Find potential candidates
        for (int num : nums) {
            if (f1 > 0 && num == m1) {
                f1++;
            } else if (f2 > 0 && num == m2) {
                f2++;
            } else if (f1 == 0) {
                m1 = num;
                f1 = 1;
            } else if (f2 == 0) {
                m2 = num;
                f2 = 1;
            } else {
                f1--;
                f2--;
            }
        }
        // Verify candidates
        f1 = 0;
        f2 = 0;
        for (int num : nums) {
            if (num == m1) {
                f1++;
            }
            if (num == m2) {
                f2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if (f1 > n / 3) {
            list.add(m1);
        }
        if (f2 > n / 3) {
            list.add(m2);
        }
        return list;
    }

}
