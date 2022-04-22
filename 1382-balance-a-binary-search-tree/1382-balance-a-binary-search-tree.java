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
// same as convert the sort array to binary search tree
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        solve(root,al);
        return balance(0,al.size()-1,al);
    }
     private static void solve(TreeNode root,ArrayList<Integer> al)
    {
        if(root==null)
            return ;
        solve(root.left,al);
        al.add(root.val);
        solve(root.right,al);
    }
    private static TreeNode balance(int start,int end,ArrayList<Integer> al)
        
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(al.get(mid));
        root.left=balance(start,mid-1,al);
        root.right=balance(mid+1,end,al);
        return root;
    }
    
}