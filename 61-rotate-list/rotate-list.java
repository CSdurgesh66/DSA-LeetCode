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
    public int size(ListNode curr){
        int i=0;
        while(curr!=null){
            curr = curr.next;
            i++;
        }
        return i;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode prev=null;
        ListNode curr = head;

        int n = size(head);
        int nth = (n - (k)%n)+1;
        int i = 1;
        while(i<nth){
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = null;
        if(curr==null) return head;
        ListNode newhead = curr;
        while(curr.next!=null) curr = curr.next;

        curr.next = head;

        return newhead;
    }
}