package Top75problem.Strings;
public class StringCompression {

    public static String compress(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            // If the next character is the same, increment the counter
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Once the character changes, append the character and its count
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1; // Reset count for the next unique character
            }
        }
        // Optional: Return original string if compression doesn't save space
        return compressed.length() < s.length() ? compressed.toString() : s;
    }
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // Output: "a2b1c5a3"
        System.out.println(compress("abcd"));        // Output: "abcd" (returns original because compression takes more space)
    }

}
