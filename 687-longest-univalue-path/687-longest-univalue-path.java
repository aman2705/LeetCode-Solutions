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
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return 0;
        int count[]=new int[1];
        int res=traverse(root,root.val,count);
        return count[0];
    }
    public static int traverse(TreeNode root,int val,int count[]) {
        if(root==null)
            return 0;
        int left=traverse(root.left,root.val,count);
        int right=traverse(root.right,root.val,count);
        count[0]=Math.max(count[0],left+right);
        if(root.val==val)
            return Math.max(left,right)+1;
        return 0;
    }
}