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
    public TreeNode increasingBST(TreeNode root) {
      
        ArrayList<Integer> al=new ArrayList<>();
        traverse(root,al);
        TreeNode temp=new TreeNode(-1);
        TreeNode temp1=temp;
        for(int i=0;i<al.size();i++)
        {
            TreeNode n=new TreeNode(al.get(i));
            temp.right=n;
            temp=temp.right;
        }
        return temp1.right;
    }
    private static void traverse(TreeNode root, ArrayList<Integer> al)
    {
        if(root==null)
            return ;
        
        traverse(root.left,al);
        al.add(root.val);
        traverse(root.right,al);
    }
    
}