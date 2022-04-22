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
    public int minDiffInBST(TreeNode root) {
        
        ArrayList<Integer> al=new ArrayList<>();
        solve(root,al);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<al.size();i++)
        {
            if(al.get(i)-al.get(i-1)<res)
                res=al.get(i)-al.get(i-1);
        }
        return res;
    }
    private static void solve(TreeNode root,ArrayList<Integer> al)
    {
        if(root==null)
            return ;
        solve(root.left,al);
        al.add(root.val);
        solve(root.right,al);
    }
}