/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public int findPos(Node rand,Node head) {
        int i=0;
        Node curr = head;
        while(curr!=null){
            if(curr==rand) return i;
            curr = curr.next;
            i++;
        }

        return 0;

    }
    public void randomTraverse(Node node,Node rand,Node head,Node chead){

        if(rand==null){
            node.random = null;
        }else{
           int pos = findPos(rand,head);
           Node temp = chead;
            while(pos>0){
            temp = temp.next;
            pos--;
           }
           node.random = temp;
        } 

    }
    public Node copyRandomList(Node head) {
        Node ccurr = new Node(100);
        Node chead = ccurr;

        Node curr = head;
        
        while(curr!=null){
            Node temp = new Node(curr.val);
            ccurr.next = temp;
            ccurr = ccurr.next;
            curr = curr.next;
        }

        curr = head;
        ccurr = chead.next;

        while(curr!=null){
            Node rand = curr.random;
            randomTraverse(ccurr,rand,head,chead.next);
            ccurr = ccurr.next;
            curr = curr.next;
        }

        return chead.next;
    }
}