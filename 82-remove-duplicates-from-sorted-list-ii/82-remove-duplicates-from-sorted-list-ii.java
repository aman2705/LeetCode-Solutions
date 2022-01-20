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
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        while(head!=null)
        {
            if(hm.containsKey(head.val))
            {
                int of=hm.get(head.val);
                int nf=of+1;
                hm.put(head.val,nf);
            }
            else
            {
                hm.put(head.val,1);
            }
            head=head.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode node=dummy;
        for(Integer i:hm.keySet())
        {
            Integer j=hm.get(i);
            if(j==1)
            {
                ListNode temp=new ListNode(i);
                dummy.next=temp;
                dummy=dummy.next;
            }
        }
        return node.next;
    }
}