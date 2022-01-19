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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null)
        {
            al.add(head.val);
            head=head.next;
        }
        int ans[]=new int[al.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=al.get(i);
        }
        
        int temp=ans[k-1];
        ans[k-1]=ans[ans.length-k];
        ans[ans.length-k]=temp;
        
        
        ListNode dummy=new ListNode(0);
        ListNode node=dummy;
        
        for(int i=0;i<ans.length;i++)
        {
            ListNode temp2=new ListNode(ans[i]);
            dummy.next=temp2;
            dummy=temp2;
        }
        return node.next;
    }
}