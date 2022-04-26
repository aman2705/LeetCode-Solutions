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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> al=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        String ans=traverse(root,hm,al);
        return al;
    
    } 
    private static String traverse(TreeNode root,HashMap<String,Integer> hm,List<TreeNode> al)
    {
         if(root==null)
            return "#";
        
        String left=traverse(root.left,hm,al);
        String right=traverse(root.right,hm,al);
        String value=root.val+","+left+","+right;
        hm.put(value,hm.getOrDefault(value,0)+1);
        if(hm.get(value)==2)
            al.add(root);
        return value;
        
    }
       
    
}