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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null)
        {
            al.add(head.val);
            head=head.next;
        }
        return solve(0,al.size()-1,al);
    }
    private static TreeNode solve(int start,int end,ArrayList<Integer> al)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(al.get(mid));
        root.left=solve(start,mid-1,al);
        root.right=solve(mid+1,end,al);
        return root;
    }
}