package Top75problem;

public class FindNumberAppearingOnce {
    public static void main(String[] args) {
    int nums[]={4, 1, 2, 1, 2};
        System.out.println(findNumber(nums));
    }
    private static int  findNumber(int[] nums) {
        int xor =0;
        for( int num : nums){
            xor ^= num;
        }
        return xor;
    }
}
