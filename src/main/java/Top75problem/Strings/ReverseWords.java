package Top75problem.Strings;
public class ReverseWords {
    public static String reverseWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }
        // 1. Trim leading/trailing spaces and split by one or more spaces "\\s+"
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        // 2. Iterate backwards through the words array
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            // Append a space between words, but not after the last word
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String sentence1 = "the sky is blue";
        System.out.println("Result: \"" + reverseWords(sentence1) + "\"");
        // Output: "blue is sky the"

        String sentence2 = "  hello   world  ";
        System.out.println("Result: \"" + reverseWords(sentence2) + "\"");
        // Output: "world hello"
    }
}
