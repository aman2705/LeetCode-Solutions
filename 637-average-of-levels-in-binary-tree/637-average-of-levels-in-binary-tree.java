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
    public List<Double> averageOfLevels(TreeNode root) {
       ArrayList<Double> al=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
         if(root==null)
             return al;
        
        Stack<ArrayList<Integer>> st=new Stack<>();
        while(!q.isEmpty())
        {
            double sum=0;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode parent=q.poll();
               
                if(parent.left!=null)
                    q.add(parent.left);
                if(parent.right!=null)
                    q.add(parent.right);
                
                sum=sum+parent.val;
            }
            al.add(sum/size);
            
        }
        return al;
    }
}