package Top75problem.BinarySearch;

public class Koko {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // The maximum speed Koko ever needs is the size of the largest pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canFinish(piles, mid, h)) {
                ans = mid;       // 'mid' is a valid speed; save it as a candidate
                high = mid - 1;  // Try to find a slower, more optimal speed to the left
            } else {
                low = mid + 1;   // 'mid' is too slow; we must increase the speed
            }
        }
        
        return ans;
    }
    
    // Helper function to check if a speed 'k' can finish all piles within 'h' hours
    private static boolean canFinish(int[] piles, int k, int h) {
        long totalHours = 0; // Use long to prevent integer overflow during summation
        
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / k) without floating-point inaccuracies
            totalHours += (pile + k - 1) / k;
        }
        
        return totalHours <= h;
    }
}
