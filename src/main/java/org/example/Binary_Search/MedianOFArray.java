package org.example.Binary_Search;

public class MedianOFArray {
    public static void main(String[] args) {
        int a[]={2, 4, 6};int b[]={1,3,5};
        System.out.println(median(a ,b));

    }

//     public double median(int[] a1, int[] a2) {
//         int n = a1.length;
//         int m = a2.length;
//         int i = 0, j = 0, k = 0;
//         int[] arr = new int[n + m];

//         while (i < n && j < m) {
//             if (a1[i] < a2[j]) {
//                 arr[k++] = a1[i++];
//             } else {
//                 arr[k++] = a2[j++];
//             }
//         }

//         // FIXED: Changed <= to < to avoid index out of bounds
//         while (i < n) {
//             arr[k++] = a1[i++];
//         }
//         while (j < m) {
//             arr[k++] = a2[j++];
//         }

//         int l = n + m;
//         if (l % 2 != 0) {
//             return (double) arr[l / 2];
//         } else {
//             // FIXED: Used 2.0 to prevent integer division truncation
//             return (arr[l / 2 - 1] + arr[l / 2]) / 2.0;
//         }
//     }
// }

        public static double median(int[] A, int[] B) {
        /*
        brute force-> A simple approach would be to merge the two arrays   and then find the median.But merging takes O(n + m) time and extra space.
        */
            int n = A.length, m = B.length;
            //We always perform binary search on the smaller array to reduce the search space and ensure the time complexity remains optimal.
            if (n > m) {
                return median(B, A);
            }

            int l = 0, r = n;
            while (l <= r) {
            /*m1 is the partition index in array A.
            m2 is the partition index in array B so that the total elements
            on the left side  equal half of the combined array.*/
                int m1 = (l + r) / 2;
                int m2 = (n + m + 1) / 2 - m1;
            /*
            l1 = largest element on left side of A
            l2 = largest element on left side of B
            r1 = smallest element on right side of A
            r2 = smallest element on right side of B
            We use MIN_VALUE and MAX_VALUE to handle edge cases.
            */

                int l1 = (m1 == 0) ? Integer.MIN_VALUE : A[m1 - 1];
                int l2 = (m2 == 0) ? Integer.MIN_VALUE : B[m2 - 1];

                int r1 = (m1 == n) ? Integer.MAX_VALUE : A[m1];
                int r2 = (m2 == m) ? Integer.MAX_VALUE : B[m2];

                if (l1 <= r2 && l2 <= r1) {
                    if ((n + m) % 2 == 0) {
                        double a = Math.max(l1, l2);
                        double b = Math.min(r1, r2);
                        return (a + b) / 2;
                    } else {
                        return Math.max(l1, l2);
                    }
                } else if (l1 > r2) {
                    r = m1 - 1;
                } else {
                    l = m1 + 1;
                }
            }
            return 0;
        }


}
