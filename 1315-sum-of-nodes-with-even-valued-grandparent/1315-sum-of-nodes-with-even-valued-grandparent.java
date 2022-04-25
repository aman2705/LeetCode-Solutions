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
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int sum=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                if(temp.val%2==0)
                {
                    if(temp.left!=null && temp.left.left!=null)
                        sum=sum+temp.left.left.val;
                    if(temp.left!=null && temp.left.right!=null)
                        sum=sum+temp.left.right.val;
                    if(temp.right!=null && temp.right.left!=null)
                        sum=sum+temp.right.left.val;
                    if(temp.right!=null && temp.right.right!=null)
                        sum=sum+temp.right.right.val;
                }
            }
        }
        return sum;
    }
}