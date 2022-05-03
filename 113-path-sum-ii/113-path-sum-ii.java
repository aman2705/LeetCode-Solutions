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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        traverse(root,al,targetSum,res);
        return res;
    }
     private static void traverse(TreeNode root,ArrayList<Integer> al,int targetSum,
                                  List<List<Integer>> res)
    {
        if(root==null)
            return ;
        
        al.add(root.val);
        if(root.left==null && root.right==null){
         int sum=0;
            
        for(int i=0;i<al.size();i++)
            sum=sum+al.get(i);
        
        if(sum==targetSum){
            res.add(new ArrayList<>(al));
        }
           
    }

        traverse(root.left,al,targetSum,res);
        traverse(root.right,al,targetSum,res) ; 
        al.remove(al.size()-1);
        
    }
}