package Top75problem;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] ={2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityele(nums));
    }

    private static int majorityele(int[] nums) {
        int n = nums.length;
        int f =0;
        int candidate =0;
        for( int num : nums){
            if(f ==0){
                candidate = num;
            }
            f+= (num == candidate)?1:-1;
        }
        f =0;
        for(int num : nums){
            if(num == candidate)f++;
        }
        return f/2 > candidate ?-1:candidate;
    }
}
