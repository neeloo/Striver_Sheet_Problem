package Top75problem.Arrays;

import java.util.Arrays;

public class NestPermutation {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void nextPermutation(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // Step 1: Find the first decreasing element from the right
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        // Step 2 & 3: If pivot is found, find its successor and swap
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        // Step 4: Reverse the sub-array to the right of the pivot
        reverse(arr, i + 1, arr.length - 1);
    }

    // Helper method to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Helper method to reverse a section of the array in-place
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
