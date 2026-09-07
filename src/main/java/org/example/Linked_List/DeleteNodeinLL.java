package org.example.Linked_List;

public class DeleteNodeinLL {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        // Create Linked List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original Linked List:");
        printLL(head);

        // Delete node 2
        deleteNode(head.next);

        System.out.println("After deleting node 2:");
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
/*

    Output:

            ```text
    Original Linked List:
            1 -> 2 -> 3 -> 4 -> null

    After deleting node 2:
            1 -> 3 -> 4 -> null
            ```

            ### Complexity

```text
            Time  = O(1)
    Space = O(1)
```

    This is a nice interview question because the interviewer may ask **"How can you delete a node without having the head?"** — the answer is exactly this technique.


 */
}
