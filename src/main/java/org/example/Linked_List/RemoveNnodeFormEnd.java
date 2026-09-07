package org.example.Linked_List;

public class RemoveNnodeFormEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node before head to handle edge cases
        ListNode dummy = new ListNode(0, head);
        // Initialize slow and fast pointers at dummy
        ListNode slow = dummy;
        ListNode fast = dummy;
        // Move fast pointer N+1 steps ahead to create a gap
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Slow is now at node before target → delete target node
        slow.next = slow.next.next;
        // Return updated head
        return dummy.next;

    }

    public static void main(String[] args) {

        // Create Linked List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLL(head);

        // Remove 2nd node from end
        int n = 2;
        head = removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printLL(head);
    }

    public static void printLL(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }



}
