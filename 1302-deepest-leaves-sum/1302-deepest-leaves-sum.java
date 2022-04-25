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
    public int deepestLeavesSum(TreeNode root) {
        int depth=getMaxDepth(root);
        int compute[]=new int[2];
        traverse(root,compute,depth);
        return compute[1];
    }
    private static void traverse(TreeNode root,int compute[],int depth)
    {
        if(root==null)
            return ;
        
        compute[0]++;
        if(compute[0]==depth)
            compute[1]=compute[1]+root.val;
        
        traverse(root.left,compute,depth);
        traverse(root.right,compute,depth);
        
        compute[0]--;
    }
    int getMaxDepth(TreeNode root) {
    	// add your logic here
		if(root==null)
			return 0;
		
		int left=getMaxDepth(root.left);
		int right=getMaxDepth(root.right);
		return 1+Math.max(left,right);
	}
}