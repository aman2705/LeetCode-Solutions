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
    
        ListNode dummy=new ListNode(0);
        ListNode node=dummy;
        
        l1=reverse(l1);
        l2=reverse(l2);
        
        int carry=0;
        int sum=0;
        
        int first;
        int second;
        
        while(l1!=null || l2!=null || carry==1)
        {
            
            if(l1!=null)
            {
                first=l1.val;
                 l1=l1.next;
            }
            else
            {
                first=0;
            }
            if(l2!=null)
            {
                second=l2.val;
                 l2=l2.next;
            }
            else
            {
                second=0;
            }
            
            sum=carry+(first+second);
            int nsum=sum%10;
            carry=sum/10;
            ListNode temp=new ListNode(nsum);
            dummy.next=temp;
            dummy=temp;
            
            //for iterating the fast and the second part
          
            
        }
        return reverse(node.next);
        
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