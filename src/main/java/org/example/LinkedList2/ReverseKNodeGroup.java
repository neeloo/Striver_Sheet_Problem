package org.example.LinkedList2;

public class ReverseKNodeGroup {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next= new ListNode(4);
        a.next.next.next.next= new ListNode(5);

        System.out.println("original list:");
        printLL(a);

        System.out.println("after reverse list:");
        int k = 2;
        ListNode result = reverseKGroup(a ,k);
        printLL(result);

    }
    public static void printLL(ListNode head){
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public  static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            if (tail == null) return head;
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }
    private static ListNode reverse(ListNode cur, ListNode end) {
        ListNode prev = null;
        while (cur != end) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

}
