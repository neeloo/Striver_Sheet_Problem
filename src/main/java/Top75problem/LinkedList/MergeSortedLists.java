package Top75problem.LinkedList;

public class MergeSortedLists {

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

    // O(n + m) Time, O(1) Space - Iterative Splicing
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node acts as a reliable starting point
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        // Loop until one of the lists becomes empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Move the tail pointer forward
        }
        
        // Append the remaining nodes from whichever list is not empty
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
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
        // List 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // List 2: 1 -> 3 -> 5
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        
        System.out.print("List 1: ");
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);

        ListNode mergedHead = mergeTwoLists(list1, list2);
        
        System.out.print("Merged Sorted List: ");
        printList(mergedHead);
    }
}
