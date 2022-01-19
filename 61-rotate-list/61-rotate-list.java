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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null|| head.next==null || k==0)
		{
			return head;
		}
        ListNode fakehead=head;
        int count=0;
        while(fakehead!=null)
        {
            count++;
            fakehead=fakehead.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode fakedummy=dummy;
        dummy.next=head;
        
        if(k>count)
        k=k%count;
        
        if(k!=0)
        {
            for(int i=0;i<count-k;i++)
            {
                dummy=dummy.next;
            }
        }
        
        head=dummy.next;
        ListNode h=head;
        dummy.next=null;
        while(h.next!=null)
        {
            h=h.next;
        }
        h.next=fakedummy.next;
        return head;
        
    }
}