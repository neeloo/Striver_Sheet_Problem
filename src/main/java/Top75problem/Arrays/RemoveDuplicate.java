package Top75problem.Arrays;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int n = removeDuplicates(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int[] arr) {
//        int j = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[j]) {
//                j++;
//                arr[j] = arr[i];
//            }
//        }
//        return j + 1;
//    }

        // Edge case: if the array is empty, it has 0 unique elements
        if (arr == null || arr.length == 0) {
            return 0;
        }

        HashSet<Integer> seen = new HashSet<>();
        int j = 0; // Pointer to place the next unique element

        for (int i = 0; i < arr.length; i++) {
            // seen.add(arr[i]) returns true only if the element wasn't already in the set
            if (seen.add(arr[i])) {
                arr[j] = arr[i]; // Move unique element to the front
                j++;
            }
        }
        return j;
    }

}
