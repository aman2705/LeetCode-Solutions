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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head1=reverse(head);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        dummy.next=head1;
        for(int i=0;i<n-1;i++)
        {
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        temp= reverse(temp.next);
        return temp;
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