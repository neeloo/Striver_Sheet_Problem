package Top75problem.Strings;
public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // Return an empty string if the array is null or empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Take the first string as the base reference
        String base = strs[0];
        // Iterate through each character of the first string
        for (int i = 0; i < base.length(); i++) {
            char c = base.charAt(i);
            // Compare character 'c' with the same position in all other strings
            for (int j = 1; j < strs.length; j++) {
                //If index exceeds a string's length or characters mismatch, return the prefix up to 'i'
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return base.substring(0, i);
                }
            }
        }
        return base;
    }
    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        System.out.println("Longest Prefix: \"" + longestCommonPrefix(words1) + "\""); 
        // Output: "fl"

        String[] words2 = {"dog", "racecar", "car"};
        System.out.println("Longest Prefix: \"" + longestCommonPrefix(words2) + "\""); 
        // Output: ""
    }
}
