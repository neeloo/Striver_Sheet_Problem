package org.example.Linked_List;

public class AddTwoNumberinLL {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum +=l1.val;
                l1=l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        // First number: 342
        // Linked List: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        // Second number: 465
        // Linked List: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        // Add two numbers
        ListNode result = addTwoNumbers(l1, l2);
        // Print result
        System.out.println("Result:");
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
/*

        ### Output

```text
    Result:
            7 -> 0 -> 8 -> null
            ```

    Because:

            ```text
342 + 465 = 807
        ```

    The linked lists store the digits in reverse:

            ```text
342 → 2 → 4 → 3
        465 → 5 → 6 → 4

        807 → 7 → 0 → 8
        ```

    So your final class will have `main()`, `addTwoNumbers()`, and `printLL()`.


 */

}
