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
    public String tree2str(TreeNode root) {
        int count[]=new int[1];
        StringBuilder sb=new StringBuilder();
        traverse(root,sb,count);
        return sb.toString();
    }
     private static void traverse(TreeNode root,StringBuilder sb,int count[])
    {
        if(root==null)
            return;
        
        if(count[0]==0)
            sb.append(root.val);
        else
            sb.append("("+root.val);
        count[0]++;
        traverse(root.left,sb,count);
       if(root.right!=null && root.left==null)
       {
           sb.append("()");
       }
        traverse(root.right,sb,count);
        
        count[0]--;
        if(count[0]!=0)
            sb.append(")");
    }
}