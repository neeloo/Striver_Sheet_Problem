package org.example.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterOnLeftSide {
    public static void main(String[] args) {
        int num[] = {4, 5, 2, 10};
        int ans[] = nextOnleft(num);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] nextOnleft(int nums[]) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ans;

    }
}
