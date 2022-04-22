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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        solve(root1,pq);
        solve(root2,pq);
        while(!pq.isEmpty())
            al.add(pq.poll());
        return al;
    }
    private static void solve(TreeNode root,PriorityQueue<Integer> pq)
    {
        if(root==null)
            return ;
        solve(root.left,pq);
        pq.add(root.val);
        solve(root.right,pq);
    }
}