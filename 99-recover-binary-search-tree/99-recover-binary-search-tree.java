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
    public void recoverTree(TreeNode root) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        traverse1st(root,pq);
        traverse2nd(root,pq);
    }
    private static void traverse1st(TreeNode root,PriorityQueue<Integer> pq)
    {
        if(root==null)
            return;
        traverse1st(root.left,pq);
        pq.add(root.val);
        traverse1st(root.right,pq);
    }
     private static void traverse2nd(TreeNode root,PriorityQueue<Integer> pq)
    {
        if(root==null)
            return;
        traverse2nd(root.left,pq);
        root.val=pq.poll();
        traverse2nd(root.right,pq);
    }
}