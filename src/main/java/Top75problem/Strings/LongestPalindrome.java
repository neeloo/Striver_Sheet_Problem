package Top75problem.Strings;

public class LongestPalindrome {
    static int maxlen = 0;
    static int len = 0;

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String A) {
        if (A.length() < 2) {
            return A;
        }
        for (int i = 0; i < A.length(); i++) {
            expand(A, i, i);       // Odd length palindrome
            expand(A, i, i + 1);   // Even length palindrome
        }
        return A.substring(len, len + maxlen);
    }

    public static void expand(String s, int a, int b) {
        while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }

        // Length of palindrome = b - a - 1
        if (b - a - 1 > maxlen) {
            maxlen = b - a - 1;
            len = a + 1;
        }
    }
}
