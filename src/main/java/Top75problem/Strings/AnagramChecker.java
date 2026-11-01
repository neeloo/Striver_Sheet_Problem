package Top75problem.Strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths match, they cannot have the same frequencies
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count frequencies for the first string
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Subtract frequencies using the second string
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);

            // If character doesn't exist or frequency drops below 0, it's not a match
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // Output: true
        System.out.println(areAnagrams("hello", "billion")); // Output: false
    }
}
