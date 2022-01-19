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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode fakehead=dummy;
        dummy.next=list1;
        ListNode head1=dummy;
        for(int i=0;i<a;i++)
        {
            head1=head1.next;
        }
        ListNode temp1=head1.next;
        head1.next=list2;
        for(int i=0;i<b-a;i++)
        {
            temp1=temp1.next;
        }
        ListNode temp2=temp1.next;
        temp1.next=null;
        
        ListNode head2=list2;
        while(list2.next!=null)
        {
            list2=list2.next;
        }
        list2.next=temp2;
        return dummy.next;
        
    }
}