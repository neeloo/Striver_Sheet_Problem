package Top75problem;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4,5, 6};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int nums[]) {
        int n = nums.length+1;
//        int naturalSum = (n * (n + 1)) / 2;
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        return naturalSum - sum;

        int xor =0;
        for( int num :nums){
            xor ^= num;
        }
        System.out.println("xor all number present in array:"+xor);
        for( int i =1;i<= n;i++){
            xor ^= i;
            System.out.println("xor of each number:"+ xor);
        }
        return xor;

    }

}
