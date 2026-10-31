package Top75problem.Arrays;

import javax.print.DocFlavor;
import java.util.HashSet;

public class LongestSubstringWithoutReaptingChararter {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(reaptingCharater(s));
    }

    private static int reaptingCharater(String s) {
        HashSet<Character> set = new HashSet<>();
        int l =0;
        int maxLen= 0;
        for( int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));l++;
            }
            set.add(ch);
            maxLen = Math.max( maxLen ,r-l+1);
        }
        return  maxLen;
    }
}
