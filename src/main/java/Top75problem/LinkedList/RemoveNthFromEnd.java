package Top75problem.LinkedList;

public class RemoveNthFromEnd {

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

    // O(n) Time, O(1) Space - Single Pass Two-Pointer Approach
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node acts as a guard to manage edge cases (like removing the head node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // Move fast pointer so that there is a gap of n nodes between slow and fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move fast to the end, maintaining the gap
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // slow.next is the node to be deleted
        slow.next = slow.next.next;
        
        return dummy.next;
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

    // Main method to run and verify the implementation
    public static void main(String[] args) {
        // Constructing a sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        System.out.print("Original List: ");
        printList(head);

        // Remove 2nd node from the end (Node 4)
        ListNode updatedHead = removeNthFromEnd(head, 2);
        
        System.out.print("Updated List (Removed 2nd from end): ");
        printList(updatedHead);
    }
}
