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
    public int averageOfSubtree(TreeNode root) {
        int count[]=new int[2];
        int res= traverse(root,count);
        return count[0];
    }
    private static int traverse(TreeNode root,int count[])
    {
        if(root==null)
            return 0;
        
        int left=traverse(root.left,count);
        int right=traverse(root.right,count);
        
        
            
        
            count[1]=0;
            total(root,count);    
            if(root.val==(root.val+left+right)/count[1])
            {
                count[0]++;
            }        
            return (root.val+left+right);
       
            
    }
    // finding the number of nodes on left and right
    private static void total(TreeNode root,int count[])
        
    {
        if(root==null)
            return ;
        
        count[1]++;
        total(root.left,count);
        total(root.right,count);
        
    }
}