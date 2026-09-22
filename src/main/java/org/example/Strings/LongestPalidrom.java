package org.example.Strings;

class LongestPalidrome {
   public static int maxlen = 0;
    public  static int len = 0;
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2)
            return s;
        for (int i = 0; i < n; i++) {
            expand(s, i, i); //for odd length substring
            expand(s, i, i + 1); //even length substring
        }
        return s.substring(len, len + maxlen);
    }
    public  static void expand(String s, int a, int b) {
        while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }
        if (maxlen < b - a - 1) { // b-a+1-2 (return if not substring)
            maxlen = b - a - 1;
            len = a + 1;
        }
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}