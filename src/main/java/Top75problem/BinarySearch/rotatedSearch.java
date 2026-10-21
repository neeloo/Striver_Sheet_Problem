package Top75problem.BinarySearch;

public class rotatedSearch {
    public static void main(String[] args) {
        // Standard Rotated Sorted Array
        int  [] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int target = 9;
        System.out.println("Index of target: " + rotatedArray(arr, target)); // Should print 3
    }

    private static int rotatedArray(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) { // Changed to <= to check single-element windows
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            // Check if the left side is sorted
            if (arr[l] <= arr[mid]) {
                // Check if the target lies within the sorted left side
                if (target >= arr[l] && target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // Otherwise, the right side must be sorted
            else {
                // Check if the target lies within the sorted right side
                if (target > arr[mid] && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

        }
        return -1;
    }
}
