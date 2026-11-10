package Top75problem.LinkedList;

public class LinkedListIntersection {

    // Definition for singly-linked list node
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) { 
            this.val = val; 
            this.next = null;
        }
    }

    // O(m + n) Time, O(1) Space - Two-Pointer Approach
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        // Loop continues until the pointers point to the same node
        while (pA != pB) {
            // Move to next node, or redirect to the head of the opposite list
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        // Returns either the intersection node or null if no intersection exists
        return pA;
    }

    // Main method to run and verify the implementation
    public static void main(String[] args) {
        // Create the shared intersecting part: 8 -> 4 -> 5
        ListNode intersectNode = new ListNode(8);
        intersectNode.next = new ListNode(4);
        intersectNode.next.next = new ListNode(5);

        // Construct List A: 4 -> 1 -> [8 -> 4 -> 5]
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersectNode;

        // Construct List B: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersectNode;

        // Find intersection
        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersected at node with value: " + result.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
