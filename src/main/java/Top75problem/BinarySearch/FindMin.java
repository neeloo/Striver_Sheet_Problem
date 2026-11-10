package Top75problem.BinarySearch;

public class FindMin {
    public static int findMin(int[] nums) {
        // Handle empty array boundary condition
        if (nums == null || nums.length == 0) {
            return -1; 
        }
        
        int low = 0;
        int high = nums.length - 1;

        // If the array is not rotated at all, the first element is the minimum
        if (nums[low] <= nums[high]) {
            return nums[low];
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than the high element, 
            // the minimum must be in the right unsorted half.
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            // If mid element is less than or equal to the high element,
            // the mid element could be the minimum, or it is in the left half.
            else {
                high = mid;
            }
        }
        
        // 'low' and 'high' will converge to the minimum element's index
        return nums[low];
    }
}
