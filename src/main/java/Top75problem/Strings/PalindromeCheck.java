package Top75problem.Strings;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int l = 0;
        int r = str.length() - 1;
        // Compare characters from both ends moving inward
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false; // Found a mismatch
            }
            l++;
            r--;
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        String test1 = "racecar";
        System.out.println(test1 + " is palindrome? " + isPalindrome(test1)); // Output: true

        String test2 = "hello";
        System.out.println(test2 + " is palindrome? " + isPalindrome(test2)); // Output: false
    }
}
