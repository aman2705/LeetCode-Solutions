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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // if(root==null)
        //     return null;
        List<List<Integer>> al1=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null)
            return al1;
        
        Stack<ArrayList<Integer>> st=new Stack<>();
        while(!q.isEmpty())
        {
            ArrayList<Integer> al=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode parent=q.poll();
               
                if(parent.left!=null)
                    q.add(parent.left);
                if(parent.right!=null)
                    q.add(parent.right);
                
                al.add(parent.val);
            }
            st.push(al);
            
        }
        
        while(!st.isEmpty())
        {
            al1.add(st.pop());
        }
        return al1;
    }
}