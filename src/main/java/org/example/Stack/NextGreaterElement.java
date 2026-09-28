package org.example.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

    }
    public static int[] nextGreater( int num[]){
        int n = num.length;
        int ans[]= new int[n];
        Stack<Integer>st = new Stack<>();
        for( int i =n-1; i>=0;i--){
            while(!st.isEmpty() && st.peek()<= num[i]){
                st.pop();
            }
        }

    }
}
