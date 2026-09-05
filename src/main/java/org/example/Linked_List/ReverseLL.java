package org.example.Linked_List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {val = 0;next = null;}

    ListNode(int data1) {val = data1;next = null;}

    ListNode(int data1, ListNode next1) {val = data1;next = next1;}
}


public class ReverseLL {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLL(head);

        head = reverseLL(head);

        System.out.println("Reversed Linked List:");
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
    public static  ListNode reverseLL(ListNode head){
        ListNode nxt = null;
        ListNode curr = head;
        ListNode prev = null;
        while( curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev= curr;
            curr= nxt;
        }
        return prev;

    }
}
