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
    public int[] nextLargerNodes(ListNode head) {
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
        int ans[]=new int[a.length];
		ans[ans.length-1]=0;
		Stack<Integer>st =new Stack<>();
		st.push(a[a.length-1]);
		
		
		for(int i=ans.length-2;i>=0;i--)
		{
			if(a[i]>=st.peek())
			{
				while(!st.isEmpty() && a[i]>=st.peek())
				{
					st.pop();
				}
				if(st.size()==0)
				{
					ans[i]=0;
				}
				else
				{
					ans[i]=st.peek();
				}
			}
			else
			{
				ans[i]=st.peek();
			}
			st.push(a[i]);
		}
        return ans;
        
    }
}