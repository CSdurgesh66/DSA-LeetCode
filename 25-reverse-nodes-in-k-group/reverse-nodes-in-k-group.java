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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = head;

        while (curr != null) {
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
            return head;

        ListNode temp = head;
        ListNode prevNode = head;

        while (temp != null) {

            ListNode kth = getKthNode(temp, k);
            if (kth == null) {
                if (prevNode != null) {
                    prevNode.next = temp;
                }
                break;
            }

           ListNode newNode = kth.next;
            kth.next = null;
            reverseList(temp);
            if (temp == head) {
                head = kth;
            } else {

                prevNode.next = kth;

            }

            prevNode = temp;
            temp = newNode;

        }

        return head;

    }

    public ListNode getKthNode(ListNode curr , int k){
        k-=1;
        while(curr!=null && k > 0){
            curr = curr.next;
            k--;
        }

        return curr;
    }

}