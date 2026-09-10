package org.example.LinkedList2;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data) {
        val = data;
        next = null;
    }

    ListNode(int data, ListNode node) {
        val = data;
        next = node;
    }
}

public class FindIntersectionLL {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    public static void printLL(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode common = new ListNode(8);
        common.next = new ListNode(3);

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = common;

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = common;

        ListNode result = getIntersectionNode(l1, l2);

        System.out.println("Result:");
        printLL(result);
    }
}