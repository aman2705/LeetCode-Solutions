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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null)
        {
            al.add(head.val);
            head=head.next;
        }
        
        int a[]=new int[al.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=al.get(i);
        }
        for(int i=1;i<a.length;i=i+2)
        {
            int temp=a[i];
            a[i]=a[i-1];
            a[i-1]=temp;
        }
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;
        
        for(int i=0;i<a.length;i++)
        {
            ListNode node=new ListNode(a[i]);
            temp.next=node;
            temp=node;
        }
        return dummy.next;
    }
}