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
    public ListNode partition(ListNode head, int x) {
        ListNode fast=new ListNode(0);
        ListNode temp1=fast;
        
        ListNode slow=new ListNode(0);
        ListNode temp2=slow;
        
        while(head!=null)
        {
            if(head.val<x)
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
        }
        fast.next=null;
       slow.next=temp1.next;
        return temp2.next;
        
       
    }
}