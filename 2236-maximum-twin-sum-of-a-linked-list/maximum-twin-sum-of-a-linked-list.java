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
     public ListNode reverseList(ListNode head, int revsize) {
        if (head==null ||  head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = head;
        int i = 0;
        while(curr!=null && i<revsize){
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
            i++;
        }
        return prev;
    }
    public int pairSum(ListNode head) {

        if(head==null) return 0;
        if(head.next.next==null) return head.val+head.next.val;
        
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            size++;
            curr = curr.next;
        }

        int revsize = size/2;
        curr = head;
        int i = 0;
        while(curr!=null && i<revsize){
            curr = curr.next;
            i++;
        }

        ListNode revHead = reverseList(head,revsize);

        int maxsum = 0;
        while(curr!=null){
            maxsum = Math.max(maxsum,revHead.val+curr.val);
            revHead = revHead.next;
            curr = curr.next;
        }

        return maxsum;
    }
}