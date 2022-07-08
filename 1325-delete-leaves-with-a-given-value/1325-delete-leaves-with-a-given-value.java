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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        
    
       // System.out.println();
       
        construct(root,target);
      // traverse(root);
        root=reconstruct(root);
        return root;
    }
    private static void construct(TreeNode root,int target){
        if(root==null)
            return;
        
        if(root.right==null && root.left==null){
            if(root.val==target){
                root.val=-1;
            }
        }

        construct(root.left,target);
        construct(root.right,target);
            if(root.right!=null && root.right.val==-1 
               && root.left==null && root.val==target){
                root.val=-1;
            }
            else if(root.left!=null && root.left.val==-1 
                    && root.right==null && root.val==target){
                root.val=-1;
            }
            else if(root.left!=null && root.right!=null &&
                   root.left.val==-1 && root.right.val==-1 && root.val==target){
                root.val=-1;
            }
 
        
        
    }
    private static void traverse(TreeNode root){
        if(root==null)
            return ;
        
        System.out.print(root.val+" ");
        traverse(root.left);
        traverse(root.right);
    }
    private static TreeNode reconstruct(TreeNode root){
        if(root==null)
            return null;
        
        if(root.val==-1)
            return null;
        
        if(root.val!=-1){
            TreeNode left=reconstruct(root.left);
            TreeNode right=reconstruct(root.right);
            if(left!=null && left.val!=-1){
                root.left=left;
            }
            else{
                root.left=null;
            }
            
            if(right!=null && right.val!=-1){
                root.right=right;
            }
            else{
                root.right=null;
            }
            
        }
        return root;
    } 
}