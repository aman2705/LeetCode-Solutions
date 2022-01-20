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
    public ListNode sortList(ListNode head) {
      
        if(head==null|| head.next==null)
		{
			return head;
		}
        ListNode mid1=mid(head);
		ListNode newhead=sortList(head);
		ListNode newhead1=sortList(mid1);
		ListNode merge=merge(newhead,newhead1);
		
		return merge;
    }
  private static ListNode mid (ListNode head) {
	    // add your logic here
		
		 ListNode slow = head;
      ListNode fast=head;
        while (fast .next!= null && fast.next.next != null) {
            slow = slow.next;
           fast= fast.next.next;
        }
        ListNode mid1 = slow.next;
        slow.next = null;
        return mid1;
	}
	private static ListNode merge(ListNode head1, ListNode head2) {

       ListNode temp=new ListNode(0);
         ListNode temp1=temp;
        while(head1!=null && head2!=null)
        {
            if(head1.val<=head2.val)
            {
               temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        if(head1!=null)
        {
            temp.next=head1;
        }
        if(head2!=null)
        {
            temp.next=head2;
        }
        
        return temp1.next;


    }
}