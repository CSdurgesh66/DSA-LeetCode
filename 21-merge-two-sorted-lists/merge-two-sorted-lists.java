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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode list3 = new ListNode(100);
        ListNode head = list3;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                list3.next=temp1;
                temp1=temp1.next;
                list3=list3.next;
            }else{
                list3.next=temp2;
                temp2=temp2.next;
                list3=list3.next;
            }
          
        }
        if(temp1!=null){
            list3.next=temp1;
            temp1=temp1.next;
            list3=list3.next;
        }
        
        if(temp2!=null){
            list3.next=temp2;
            temp2=temp2.next;
            list3=list3.next;
        }
        return head.next;
    }
}