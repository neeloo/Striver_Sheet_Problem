package org.example.Linked_List;

public class MergeTwoSortedLL {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        System.out.println("print list1:");
        printLL(list1);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        System.out.println("print list2:");
        printLL(list2);

        System.out.println("print merge sorted list:");
        ListNode result = mergeTwoLists(list1, list2);
        printLL(result);
    }
    public static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0) , list = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                list.next = list1;
                list1 = list1.next;
            }else{
                list.next = list2;
                list2= list2.next;
            }
            list = list.next;

        }
        list.next = (list1 != null)?list1:list2;
        return dummy.next;

    }
}
