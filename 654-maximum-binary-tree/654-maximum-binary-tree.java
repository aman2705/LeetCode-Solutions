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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traverse(0,nums.length-1,nums);
    }
    private static TreeNode traverse(int start,int end,int nums[])
    {
        if(start>end)
            return null;
        
        int index=start;
        for(int i=start;i<=end;i++)
        {
            if(nums[i]>nums[index])
                index=i;
        }
        
        TreeNode root=new TreeNode(nums[index]);
        root.left=traverse(start,index-1,nums);
        root.right=traverse(index+1,end,nums);
        return root;
    }
}