package org.example.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int num[]={4, 5, 2, 10};
        int ans[]= nextGreater(num);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] nextGreater( int num[]){
        int n = num.length;
        int ans[]= new int[n];
        Stack<Integer>st = new Stack<>();
        for( int i =n-1; i>=0;i--){
            while(!st.isEmpty() && st.peek()<= num[i]){
                st.pop();
            }
            ans[i]= st.isEmpty()?-1:st.peek();
            st.push(num[i]);
        }
        return ans;

    }
}
