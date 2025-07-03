package org.example.Array;

import java.util.*;

import static java.lang.reflect.Array.set;

public class Union_ofTwo_sorted_Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 6, 7};
        int ans[] = unionOfarrray(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] unionOfarrray(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) set.add(num); ///add ele for first arr
        for (int num : b) set.add(num);  ///add ele for second arr
        /// add ele in arraylist
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int it : set) {
//            res.add(it);
//        }
//        int ans[] = new int[res.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = res.get(i);
//        }
//        return ans;


        /// /or use this
        int[] intArray = set.stream().mapToInt(Integer::intValue).toArray(); // Unbox Integer to int

        return intArray;
    }
}
