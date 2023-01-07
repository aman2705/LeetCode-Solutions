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
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       
        temp.next=null;
        ListNode head1=sortList(head);
        ListNode head2=sortList(slow);
        return merge(head1,head2);
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode temp=new ListNode(0);
        
        ListNode dummy=temp;
        while(head1!=null && head2!=null){
            
            if(head1.val<=head2.val){
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
        if(head1!=null){
            temp.next=head1;
        }
        if(head2!=null){
            temp.next=head2;
        }
        return dummy.next;
    }
}