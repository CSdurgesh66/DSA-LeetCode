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
        int carry = 0;
        ListNode ans = new ListNode(100);
        ListNode res = ans;
        if(l1==null || l2==null) return l1;
        while(l1!=null && l2!=null){
            int val = l1.val + l2.val + carry;
            carry=0;
            if(val>9){
                carry = val/10;
                val = val%10;
            }
            ans.next = new ListNode(val);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null) {
           int val = carry+l1.val;
           carry=0;
             if(val>9){
                carry = val/10;
                val = val%10;
            }
            ans.next = new ListNode(val);
            ans = ans.next;
            l1 = l1.next;
        }
        while(l2!=null){
          int  val = carry+l2.val;
          carry=0;
             if(val>9){
                carry = val/10;
                val = val%10;
            }
            ans.next = new ListNode(val);
            ans = ans.next;
            l2 = l2.next;
        }
        if(carry!=0){
            ans.next = new ListNode(carry);

        }
       return res.next;
    }
}