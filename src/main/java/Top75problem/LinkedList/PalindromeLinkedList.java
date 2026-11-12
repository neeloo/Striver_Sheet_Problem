package Top75problem.LinkedList;

public class PalindromeLinkedList {

    // Definition for singly-linked list node
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        
        ListNode(int val) { 
            this.val = val; 
        }
        
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    // O(n) Time, O(1) Space - Middle-Finding and Reversal Approach
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the end of the first half using fast/slow pointers
        ListNode firstHalfEnd = endOfFirstHalf(head);
        
        // 2. Reverse the second half
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        // 3. Check if the list is a palindrome
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4. Restore the original list structure (Good practice)
        firstHalfEnd.next = reverseList(secondHalfStart);

        return result;
    }

    // Helper method to find the middle node
    private static ListNode endOfFirstHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper method to reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    // Main method to run and verify the implementation
    public static void main(String[] args) {
        // Test Case 1: Palindrome list (1 -> 2 -> 2 -> 1)
        ListNode palindromeList = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println("Is palindrome? (Expected true): " + isPalindrome(palindromeList));

        // Test Case 2: Non-palindrome list (1 -> 2 -> 3)
        ListNode normalList = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println("Is palindrome? (Expected false): " + isPalindrome(normalList));
    }
}
