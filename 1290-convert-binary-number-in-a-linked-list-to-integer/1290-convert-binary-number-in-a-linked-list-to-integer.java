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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(head!=null)
        {
            al.add(head.val);
            head=head.next;
        }
       double sum=0;
        int count=0;
        for(int i=al.size()-1;i>=0 ;i--)
        {
            sum=sum+al.get(i)*Math.pow(2,count);
            count++;
        }
        return (int)sum;
    }
}