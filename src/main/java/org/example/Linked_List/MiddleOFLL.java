package org.example.Linked_List;

class Node{
    int val ;
    Node next ;
    Node(){val=0;next=null;}
    Node(int data){val=data;next=null;}
    Node( int data , Node node){val= data;next=node;}
}
public class MiddleOFLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next= new Node(5);

        System.out.println("Original Linked List:");
        printLL(head);

        Node middle = middleOfLL(head);
        System.out.println("Middle value of Linked List:");
        System.out.println(middle.val);

    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node middleOfLL(Node head) {
        Node slow = head;
        Node fast = head;
        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
}
