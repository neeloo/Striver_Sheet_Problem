package org.example.Arrays2;

public class Majority1 {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] A) {
        int majority = -1;
        int frequency = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (frequency == 0) {
                majority = A[i];
                frequency = 1;
            } else if (A[i] == majority) {
                frequency++;
            } else {
                frequency--;
            }
        }
        frequency = 0; //(reset this)
        for (int i = 0; i < n; i++) {
            if (A[i] == majority) {
                frequency++;
            }
        }
        return frequency > (n / 2) ? majority : -1;

    }

}
