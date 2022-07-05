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
        
        Node iterate=head;
        Node newnode=head;
        
        while(head!=null){
            Node nextnode=head.next;
            
            // creating deep copy of everything
            Node node1=new Node(head.val);
            head.next=node1;
            node1.next=nextnode;
            
            head=nextnode;
        }
        
        head=newnode;
        while(head!=null){
            // pointing random pointers
            if(head.random!=null){
                head.next.random=head.random.next;
            }
            head=head.next.next;
        }
        
        head=newnode;
        Node dummy=new Node(0);
        Node copy=dummy;
        while(head!=null){
            Node nextnode=head.next.next;
            
            // creating copy
            dummy.next=head.next;
            dummy=dummy.next;
            
            // making old connection
            head.next=nextnode;
            head=nextnode;
        }
        return copy.next;
    }
}