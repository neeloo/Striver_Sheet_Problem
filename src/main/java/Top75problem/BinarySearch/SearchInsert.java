package Top75problem.BinarySearch;

public class SearchInsert {
    public static int searchInsertPosition(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        // If the target is greater than the last element, insert it at the very end
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid - 1; // Look left to see if there's a smaller valid index
            } else {
                low = mid + 1;  // Look right because arr[mid] is too small
            }
        }
        // 'low' will naturally point to the correct insertion index
        return low; 
    }
}
