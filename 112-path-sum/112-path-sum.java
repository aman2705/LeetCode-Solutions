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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        ArrayList<Integer> al=new ArrayList<>();
        boolean res=traverse(root,al,targetSum);
        return res;
    }
    private static boolean traverse(TreeNode root,ArrayList<Integer> al,int targetSum)
    {
        if(root==null)
            return false;
        
        al.add(root.val);
        if(root.left==null && root.right==null){
         int sum=0;
            
        for(int i=0;i<al.size();i++)
            sum=sum+al.get(i);
        
        if(sum==targetSum){
            return true;
        }
           
    }
       
        
        if(traverse(root.left,al,targetSum)==true|| traverse(root.right,al,targetSum)==true)
            return true;
        
        al.remove(al.size()-1);
        return false;
    }
}