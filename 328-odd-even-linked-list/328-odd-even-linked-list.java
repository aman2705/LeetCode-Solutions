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
    public ListNode oddEvenList(ListNode head) {
        ListNode fast=new ListNode(0);
        ListNode temp1=fast;
        
        ListNode slow=new ListNode(0);
        ListNode temp2=slow;
        int count=1;
        while(head!=null)
        {
            if(count%2==1)
            {
               slow.next=head;
               slow=head;
                
            }
            else
            {
               fast.next=head;
                fast=head;
                
            }
            
            head=head.next;
            count++;
        }
        
        fast.next=null;
       slow.next=temp1.next;
        return temp2.next;
        

    }
}