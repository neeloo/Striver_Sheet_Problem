package org.example.LinkedList2;

import java.util.ArrayList;
import java.util.List;
import static org.example.LinkedList2.FindIntersectionLL.printLL;

public class RotatedLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next= new ListNode(5);

        printLL(head);
        ListNode ans = rotateRight(head , 2);
        System.out.println("print reverse LL:");
        printLL(ans);
    }

        public  static ListNode rotateRight(ListNode head, int k) {
            List<Integer> list = new ArrayList<>();
            // Convert linked list to ArrayList
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int n = list.size();

            if (n == 0 || n == 1 || k == 0) {
                return head;
            }

            k = k % n;

            // Rotate array to the right by k
            reverse(list, 0, n - 1);
            reverse(list, 0, k - 1);
            reverse(list, k, n - 1);

            // Rebuild linked list
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            for (int i = 0; i < n; i++) {
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }
            return dummy.next;
        }
        public static void reverse(List<Integer> list, int i, int j) {
            while (i < j) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
            }
        }



}
