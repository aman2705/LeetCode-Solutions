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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode lprev=dummy;
        for(int i=0;i<left-1;i++)
        {
            lprev=lprev.next;
        }
        
        ListNode curr=lprev.next;
        ListNode prev=null;
        for(int i=0;i<right-left+1;i++)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        lprev.next.next=curr;
        lprev.next=prev;
        
        return dummy.next;
        
    }
}