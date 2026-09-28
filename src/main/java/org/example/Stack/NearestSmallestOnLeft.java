package org.example.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestOnLeft {
    public static void main(String[] args) {
        int num[] = {4, 5, 2, 10};
        int ans[] = nearestSmallest(num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nearestSmallest(int[] num) {
        Stack<Integer>st =  new Stack<>();
        int ans[]= new int[num.length];
        for( int i =0;i<num.length;i++){
            while(!st.isEmpty() && st.peek()>= num[i]){
                st.pop();
            }
            ans[i]= st.isEmpty()?-1:st.peek();
            st.push(num[i]);
        }
        return ans;
    }
}
