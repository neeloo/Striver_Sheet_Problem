package Top75problem.LinkedList;

public class AddTwoNumbers {

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

    // O(max(n, m)) Time, O(max(n, m)) Space
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // Continue loop if elements remain or a carry needs to be added
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Calculate sum and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            
            // Create new node with the digit value
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move forward in the source lists if possible
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
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
        // List 1 represents 342: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        
        // List 2 represents 465: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        
        System.out.print("First Number List:  ");
        printList(l1);
        System.out.print("Second Number List: ");
        printList(l2);

        // Sum should be 342 + 465 = 807 (Represented as: 7 -> 0 -> 8)
        ListNode result = addTwoNumbers(l1, l2);
        
        System.out.print("Result Sum List:    ");
        printList(result);
    }
}
