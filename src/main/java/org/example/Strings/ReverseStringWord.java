package org.example.Strings;


public class ReverseStringWord {

    public static void main(String[] args) {
        String s = "the sky is blue";
        // Call the manual character reversal method
        System.out.println(reverseManual(s));
    }
    public static String reverseManual(String s) {
        // Handle edge case if the string is empty or null
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder res = new StringBuilder();

        // Start from the last index (length - 1) and move backwards to 0
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i)); // Grab each character one by one
        }

        return res.toString();
    }
}
