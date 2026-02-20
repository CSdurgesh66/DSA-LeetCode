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
    public Node copyRandomList(Node head) {

        Node curr = head;

        while(curr!=null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }


        Node temp = new Node(100);
        Node copycurr = temp;
        curr = head;
        while(curr!=null){
            Node copy = curr.next;
            copycurr.next = copy;
            copycurr = copy;
            curr.next = copy.next;
            curr = curr.next;
        }
        return temp.next;
        
    }
}