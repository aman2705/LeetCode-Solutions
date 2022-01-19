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
    public void reorderList(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
       while(fast.next!=null && fast.next.next!=null)
       {
           
           slow=slow.next;
           fast=fast.next.next;
       }
    
      ListNode head2=reverse(slow.next);
        slow.next=null;
  
        while(head!=null && head2!=null)
        {
            ListNode temp=head.next;
            ListNode temp1=head2.next;
            
           head2.next=head.next;
            head.next=head2;
            
            
            head=temp;
            head2=temp1;
        }
        
        
        
    }
    private static ListNode reverse(ListNode head)
    {
        ListNode dummynode=null;
		while(head!=null)
		{
			ListNode nextnode=head.next;
			head.next=dummynode;
			dummynode=head;
			head=nextnode;
		}
		return dummynode;
    }
}