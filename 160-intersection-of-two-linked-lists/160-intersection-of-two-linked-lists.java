/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1=headA;
        ListNode head2=headB;
        int count=0;
        int len1=0,len2=0,sum;
        while(headA!=null)
        {
            headA=headA.next;
            len1++;
        }
        while(headB!=null)
        {
            headB=headB.next;
            len2++;
        }
        if(len1>len2)
        {
            sum=len1-len2;
            while(count<sum)
            {
                head1=head1.next;
                count++;
            }
        }
        else
        {
            sum=len2-len1;
            while(count<sum)
            {
                head2=head2.next;
                count++;
            }
        }
        while(head1!=head2)
        {
            head1=head1.next;
            head2=head2.next;
        }
        return head1;
        
        
    }
}