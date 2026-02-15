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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode ans = null;
        if(lists == null || n == 0) return ans;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode node:lists){
            if(node!=null) pq.add(node);
        }

        ListNode curr = new ListNode(100);
        ListNode head = curr;

        while(!pq.isEmpty()){
            ListNode minNode = pq.poll();

            curr.next = minNode;
            curr = curr.next;
            minNode = minNode.next;
            if(minNode!=null){
                pq.add(minNode);
            }
        }

      
        return head.next;
    }
}