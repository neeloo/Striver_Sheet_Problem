package Top75problem.Strings;
import java.util.HashMap;
import java.util.Map;
public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths match, they cannot have the same frequencies
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        // Count frequencies for the first string
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Subtract frequencies using the second string
        for (char c : str2.toCharArray()) {
            // If a character doesn't exist or frequency drops below 0, it's not a match
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // Output: true
        System.out.println(areAnagrams("hello", "billion")); // Output: false
    }
}
