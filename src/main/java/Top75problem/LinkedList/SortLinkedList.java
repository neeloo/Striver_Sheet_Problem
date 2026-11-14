package Top75problem.LinkedList;
public class SortLinkedList {

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

    // O(n log n) Time, O(log n) Stack Space - Merge Sort Algorithm
    public static ListNode sortList(ListNode head) {
        // Base case: list is empty or has only a single node
        if (head == null || head.next == null) {
            return head;
        }
        
        // 1. Split the list into two halves
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Disconnect the first half from the second half
        prev.next = null;
        
        // 2. Recursively sort each half
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(slow);
        
        // 3. Merge the two sorted lists together
        return merge(leftSorted, rightSorted);
    }
    
    // Helper method to merge two sorted lists (In-place)
    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        // Append remaining nodes
        tail.next = (list1 != null) ? list1 : list2;
        
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
        // Unsorted input list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        
        System.out.print("Original List: ");
        printList(head);

        ListNode sortedHead = sortList(head);
        
        System.out.print("Sorted List:   ");
        printList(sortedHead);
    }
}
