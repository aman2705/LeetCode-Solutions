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
    public boolean evaluateTree(TreeNode root) {
        traverse(root);
         if(root.val==1)
             return true;
        else
            return false;
    }
    private static void traverse(TreeNode root){
        if(root==null)
            return ;
        
        if(root.left==null && root.right==null)
            return;
        
        traverse(root.left);
        traverse(root.right);
        if(root.val==2)
            root.val=root.left.val | root.right.val;
        
        else if(root.val==3)
            root.val=root.left.val & root.right.val;
    }
}