package org.example.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestnRight {
    public static void main(String[] args) {
        int num[] = {4, 5, 2, 10};
        int ans[] = nearestSmallestright(num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nearestSmallestright(int[] num) {
        int ans[]= new int[num.length];
        Stack<Integer>st= new Stack<>();
        for( int i = num.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>= num[i]){
                st.pop();
            }
            ans[i]= st.isEmpty()?-1:st.peek();
            st.push(num[i]);
        }
        return ans;

    }
}
