package org.example.LinkedList2;

public class FindstartPointLL {

    public static void main(String[] args) {

        // Linked List:
        // 1 -> 2 -> 3 -> 4 -> 5
        //          ^         |
        //          |_________|
        //
        // Cycle starts at node 3

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        ListNode result = findStartingPoint(head);

        if (result != null) {
            System.out.println("Starting point of cycle: " + result.val);
        } else {
            System.out.println("No cycle found");
        }
    }

    public static ListNode findStartingPoint(ListNode head) {

        ListNode s = head;
        ListNode f = head;

        // Detect cycle
        while (f != null && f.next != null) {

            s = s.next;
            f = f.next.next;

            if (s == f) {
                break;
            }
        }

        // No cycle
        if (f == null || f.next == null) {
            return null;
        }

        // Find starting point of cycle
        ListNode a = head;
        ListNode b = s;

        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;
    }
}