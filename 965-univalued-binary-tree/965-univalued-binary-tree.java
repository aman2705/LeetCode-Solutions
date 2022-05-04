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
    public boolean isUnivalTree(TreeNode root) {
        
        HashSet<Integer> hm=new HashSet<>();
        traverse(root,hm);
        if(hm.size()>1)
            return false;
        return true;
    }
    private static void traverse(TreeNode root,HashSet<Integer> hm)
    {
        if(root==null)
            return ;
        hm.add(root.val);
        traverse(root.left,hm);
        traverse(root.right,hm);
    }
}