package org.example.Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {2,1,0,0,1,2};
        sortZeroOneTwo(arr);

    }

//     public void sortZeroOneTwo(int[] nums) {
//         int n = nums.length;
//         for(int j=0; j<n; j++){
//             for(int i=0; i<n-1; i++){
//                 if(nums[i]>nums[i+1]){
//                     int temp=nums[i];
//                     nums[i]=nums[i+1];
//                     nums[i+1]=temp;
//                 }
//             }
//         }
//     }
// }

        public static void sortZeroOneTwo(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
            while (mid <= high) {
                if (nums[mid] == 0) {
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }
                else if (nums[mid] == 1) {
                    mid++;
                }
                else {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
            System.out.println(Arrays.toString(nums));
        }

}
