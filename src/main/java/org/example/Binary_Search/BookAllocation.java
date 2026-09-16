package org.example.Binary_Search;

public class BookAllocation {
    public static void main(String[] args) {
        int a[] = {12, 34, 67, 90};
        int m = 2;
        System.out.println(findPages(a, m));

    }
    public static int findPages(int[] A, int B) {
        //B=studet -->just like painter int painter problem calculate min time
        if (B > A.length) return -1;

        int n = A.length;
        int maxEle = 0, totalSum = 0;
        for (int a : A) {
            maxEle = Math.max(maxEle, a);
            totalSum += a;
        }
        int l = maxEle, r = totalSum, ans = totalSum;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cnt = countStudent(A, mid);
            if (cnt <= B) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static int countStudent(int a[], int T) {
        int c = 1, t = T;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > T) return Integer.MAX_VALUE;
            if (a[i] <= t) {
                t = t - a[i];
            } else {
                c++;
                t = T - a[i];
            }
        }
        return c;

    }
}
