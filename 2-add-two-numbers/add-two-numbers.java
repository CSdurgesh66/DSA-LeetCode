/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode head = new ListNode(100);
        ListNode temp = head;

        int carry = 0;
        while (curr1 != null && curr2 != null) {
            int sum = curr1.val + curr2.val + carry;
            carry = sum / 10;
            int rem = sum % 10;

            ListNode node = new ListNode(rem);

            temp.next = node;

            temp = temp.next;
            curr1 = curr1.next;
            curr2 = curr2.next;

        }

        while (curr1 != null) {
            int sum = carry + curr1.val;
            carry = sum / 10;
            int rem = sum % 10;
            temp.next = new ListNode(rem);

            temp = temp.next;
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            int sum = carry + curr2.val;
            carry = sum / 10;
            int rem = sum % 10;
            temp.next = new ListNode(rem);

            temp = temp.next;
            curr2 = curr2.next;

        }

        if (carry == 1) {
            temp.next = new ListNode(carry);
        }

        return head.next;
    }
}