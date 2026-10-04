package Top75problem;

public class LeftRotationByone {
    public static void main(String[] args) {

    }
    public  static  int[]  left(int nums[] , int k)
    {
        int n = nums.length;
        k = k%n;
         reverse(nums , 0 , k);
         reverse(nums , k , n-1);
        reverse(nums , 0 , n-1);
        return nums;
    }
    public  static  void reverse( int nums [] , int l , int r){
        while( l <r){
            int temp = nums[l];
            nums[l]= nums[r];
            nums[r]= temp;
            l++;r--;
        }
    }

}
