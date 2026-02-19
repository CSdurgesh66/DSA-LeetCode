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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
            size++;
        }
        if(size==1) return null;
        if(n==size) return head.next;

        int nodeFromSt =  (size-n+1);
        int i=1;
        ListNode prev = new ListNode(10);
        curr = head;
        while(i<nodeFromSt){
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = curr.next;
        return head;
    }
}