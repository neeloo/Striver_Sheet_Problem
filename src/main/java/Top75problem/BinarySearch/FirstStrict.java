package Top75problem.BinarySearch;

public class FirstStrict {
    public static int firstStrictlyGreater(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids potential integer overflow

            if (arr[mid] > target) {
                ans = mid;          // Current index is a candidate
                high = mid - 1;     // Look left for a smaller index that is still > target
            } else {
                low = mid + 1;      // Look right because arr[mid] <= target
            }
        }
        return ans; // Returns -1 if no element is strictly greater
    }
}
