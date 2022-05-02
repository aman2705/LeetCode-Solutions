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
class Pair{
    TreeNode node;
    int depth;
    Pair(TreeNode node,int depth)
    {
        this.node=node;
        this.depth=depth;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int min=q.peek().depth;
            int last=0;
            int first=0;
            for(int i=0;i<size;i++)
            {
                Pair p=q.poll();
                TreeNode parent=p.node;
                if(i==0)
                    first=p.depth-min;
                if(i==size-1)
                    last=p.depth-min;
                if(parent.left!=null)
                    q.add(new Pair(parent.left,p.depth*2+1));
                if(parent.right!=null)
                    q.add(new Pair(parent.right,p.depth*2+2));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
       
    }
}