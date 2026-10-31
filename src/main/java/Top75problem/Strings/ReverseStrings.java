package Top75problem.Strings;

public class ReverseStrings {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s)); // Output: olleh
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {return str;}
        // Convert the immutable string to a mutable character array
        char[] chars = str.toCharArray();
        int l = 0;
        int r = chars.length - 1; // Fix: index starts at length - 1
        // Fix: pointer logic loop should stop when they cross (l < r)
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        // Convert the character array back to a String
        return new String(chars);
    }
}
