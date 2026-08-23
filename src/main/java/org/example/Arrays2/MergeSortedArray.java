package org.example.Arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        // nums1 must have a total capacity of m + n (4 valid elements + 4 empty spaces)
        int a1[] = {3, 4, 5, 6, 0, 0, 0, 0};
        int m = 4; // Number of valid sorted elements in a1


        // nums2 must be fully sorted for this algorithm to work
        int a2[] = {1, 7, 8, 9};
        int n = a2.length; // Number of elements in a2


        System.out.println("Before merging a1: " + Arrays.toString(a1));
        System.out.println("Before merging a2: " + Arrays.toString(a2));

        merge(a1, m, a2, n);
    }

     public static void merge(int[] nums1, int m, int[] nums2, int n) {
         // Create a copy of the original nums1 elements to prevent overwriting them
         int[] nums1Copy = new int[m];
         for (int index = 0; index < m; index++) {
             nums1Copy[index] = nums1[index];
         }

         int i = 0; // Pointer for nums1Copy
         int j = 0; // Pointer for nums2
         int k = 0; // Pointer for final nums1 array

         // Changed conditions to use correct bounds: i < m and j < n
         while (i < m && j < n) {
             if (nums1Copy[i] <= nums2[j]) {
                 nums1[k++] = nums1Copy[i++];
             } else {
                 nums1[k++] = nums2[j++];
             }
         }

         // Changed loop condition from <= to strictly < to avoid out of bounds
         while (i < m) {
             nums1[k++] = nums1Copy[i++];
         }

         // Changed loop condition from <= to strictly < to avoid out of bounds
         while (j < n) {
             nums1[k++] = nums2[j++];
         }
         System.out.println(Arrays.toString(nums1));
     }
 }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;         // Pointer for end of valid nums1 elements
//        int j = n - 1;         // Pointer for end of nums2 elements
//        int k = m + n - 1;     // Pointer for the very last index of nums1
//
//        // Merge from the highest values to the lowest values
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//
//        // If elements remain in nums2, copy them over
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
//        System.out.println("After merging:      " + Arrays.toString(nums1));
//
//        // Elements remaining in nums1 (i >= 0) are already in their correct places
//    }
//}
