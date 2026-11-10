package Top75problem.LinkedList;

public class LinkedListReversal {

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

    // 1. Iterative Approach - O(n) Time, O(1) Space
    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // Store the next node
            curr.next = prev;              // Reverse the pointer
            prev = curr;                   // Move prev forward
            curr = nextTemp;               // Move curr forward
        }
        return prev; // New head of the reversed list
    }

    // 2. Recursive Approach - O(n) Time, O(n) Space (due to call stack)
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode reversedHead = reverseListRecursive(head.next);
        head.next.next = head; // Make the next node point back to current
        head.next = null;      // Break the original forward link
        
        return reversedHead;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method to run and verify the implementations
    public static void main(String[] args) {
        // Constructing a sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        System.out.print("Original List: ");
        printList(head);

        // Test Iterative Reversal
        ListNode iterativeReversed = reverseListIterative(head);
        System.out.print("Iteratively Reversed: ");
        printList(iterativeReversed);

        // Test Recursive Reversal (reversing it back to normal)
        ListNode recursiveReversed = reverseListRecursive(iterativeReversed);
        System.out.print("Recursively Reversed Back: ");
        printList(recursiveReversed);
    }
}
