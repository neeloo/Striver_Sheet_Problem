package Top75problem;

public class SecondLargestNo {
    public static void main(String[] args) {
        int nums[]= {2, 5, 9, 34 , 29};
        System.out.println(secondLargest(nums));
    }

    private static int secondLargest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for( int x : nums){
            if(x > first){
                second = first;
                first= x;
            }
            else if(x > second && x != first){
                second = x;
            }
        }
        return  second;
    }
}
