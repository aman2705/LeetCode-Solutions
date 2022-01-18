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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=new ListNode(-1);
        ListNode dummy=temp;
        while(head!=null)
        {
            if(!al.contains(head.val))
            {
                al.add(head.val);
                ListNode node=new ListNode(head.val);
                temp.next=node;
                temp=node;
            }
                
            head=head.next;
        }
        return dummy.next;
    }
}