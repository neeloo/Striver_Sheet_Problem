package Top75problem.BinarySearch;

public class SearchReang {
    public static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);
        return result;
    }

    // Binary search to find the first occurrence
    private static int findFirst(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int firstIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                firstIdx = mid;
                high = mid - 1; // Keep looking left to find the first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstIdx;
    }

    // Binary search to find the last occurrence
    private static int findLast(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int lastIdx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                lastIdx = mid;
                low = mid + 1;  // Keep looking right to find the last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastIdx;
    }
}
