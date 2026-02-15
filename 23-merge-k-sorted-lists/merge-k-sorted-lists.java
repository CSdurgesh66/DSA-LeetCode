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

    public ListNode divide(ListNode[] lists, int left, int right){
        if(left==right){
            return lists[left];
        }

        int mid = left + (right-left)/2;

        ListNode l1 = divide(lists,left,mid);
        ListNode l2 = divide(lists,mid+1,right);

        return merge(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(lists==null || n==0) return null;

        return divide(lists,0,n-1);
       
    }

}