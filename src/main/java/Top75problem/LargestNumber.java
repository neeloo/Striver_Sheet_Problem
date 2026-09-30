package Top75problem;

public class LargestNumber {
    public static void main(String[] args) {
        int nums[]= {2, 5, 9, 34 , 29};
        System.out.println(largestNumber(nums));

    }
    public static int largestNumber( int nums[]){
        int largest = nums[0];
        for( int x :nums){
            largest = Math.max(largest , x);
        }
        return largest;

    }
}
