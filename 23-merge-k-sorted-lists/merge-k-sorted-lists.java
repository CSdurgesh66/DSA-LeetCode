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
    public ListNode merge(ListNode A,ListNode B){
        ListNode curr = new ListNode(100);
        ListNode head = curr;

        while(A!=null && B!=null){
            if(A.val < B.val){
                curr.next = A;
                A = A.next;
                curr = curr.next;
            }else {
                curr.next = B;
                B = B.next;
                curr = curr.next;
            }
        }

        while(A!=null){
            curr.next = A;
            A = A.next;
            curr = curr.next;
        }

        
        while(B!=null){
            curr.next = B;
            B= B.next;
            curr = curr.next;
        }

        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode ans = null;
        if(n==0) return ans;
        ListNode A = lists[0];
        if(A==null && n==1) return ans;
        for(int i=1;i<n;i++){
            ListNode B = lists[i];

            A = merge(A,B);
        }
        return A;
    }
}