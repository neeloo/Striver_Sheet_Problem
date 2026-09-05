package org.example.Arrays3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubarrayWithoutRepeation {
    public static void main(String[] args) {
        String S = "abcddabac";
        System.out.println(longestNonRepeatingSubstring(S));

    }

        public  static int longestNonRepeatingSubstring(String s) {
            //your code goes here
            Set<Character> set = new HashSet<>();
            int l =0; int maxLength =0;
            for( int r =0; r<s.length();r++){
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
                maxLength = Math.max(maxLength, r - l + 1);
            }
            return maxLength;
        }

}
