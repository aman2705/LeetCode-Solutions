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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null|| head.next==null)
        {
            return null;
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null)
        {
            al.add(head.val);
            head=head.next;
        }
        al.remove(al.size()/2);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<al.size();i++)
        {
            ListNode node=new ListNode(al.get(i));
            dummy.next=node;
            dummy=node;
        }
        return temp.next;
    }
}