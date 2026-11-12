package Top75problem.BinarySearch;

public class Lower {
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;          // Current index is a candidate (>= target)
                high = mid - 1;     // Look left to find a smaller index that satisfies the condition
            } else {
                low = mid + 1;      // Look right because arr[mid] < target
            }
        }
        return ans; // Returns -1 if all elements in the array are strictly smaller than target
    }
}
