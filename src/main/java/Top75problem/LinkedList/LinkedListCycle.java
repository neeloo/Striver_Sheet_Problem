package Top75problem.LinkedList;

public class LinkedListCycle {

    // Definition for singly-linked list node
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) { 
            this.val = val; 
            this.next = null;
        }
    }

    // O(n) Time, O(1) Space - Floyd's Cycle Detection Algorithm
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Moves 1 step
            fast = fast.next.next;    // Moves 2 steps
            
            // If they meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        
        // Fast pointer reached the end of the list, so no cycle exists
        return false;
    }

    // Main method to run and verify the implementation
    public static void main(String[] args) {
        // Constructing a sample list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        // Test Case 1: No cycle
        System.out.println("Has cycle? (Expected false): " + hasCycle(head));

        // Creating a cycle: -4 points back to 2
        node4.next = node2;

        // Test Case 2: With cycle
        System.out.println("Has cycle? (Expected true): " + hasCycle(head));
    }
}
