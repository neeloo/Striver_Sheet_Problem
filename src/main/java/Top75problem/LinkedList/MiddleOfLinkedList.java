package Top75problem.LinkedList;

public class MiddleOfLinkedList {

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

    // O(n) Time, O(1) Space - Fast and Slow Pointer Approach
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow now points to the middle node
        return slow;
    }

    // Main method to run and verify the implementation
    public static void main(String[] args) {
        // Example 1: Odd length list (1 -> 2 -> 3 -> 4 -> 5)
        ListNode oddList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode middleOdd = findMiddle(oddList);
        System.out.println("Odd list middle value (Expected 3): " + middleOdd.val);

        // Example 2: Even length list (1 -> 2 -> 3 -> 4 -> 5 -> 6)
        ListNode evenList = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode middleEven = findMiddle(evenList);
        System.out.println("Even list middle value (Expected 4): " + middleEven.val);
    }
}
