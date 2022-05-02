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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int maxsum=Integer.MIN_VALUE;
        int count=0;
        int ans=0;
        while(!q.isEmpty())
        {
            int sum=0;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode parent=q.poll();
                sum=sum+parent.val;
                
                if(parent.left!=null)
                    q.add(parent.left);
                
                if(parent.right!=null)
                    q.add(parent.right);
            }
            count++;
            if(sum>maxsum)
            {
                maxsum=sum;
                ans=count;
            }
        }
        return ans;
    }
}