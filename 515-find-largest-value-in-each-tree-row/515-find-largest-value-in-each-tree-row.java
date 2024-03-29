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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null)
            return al;
        while(!q.isEmpty()){
            int size=q.size();
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            
            for(int i=0;i<size;i++)
            {
               TreeNode temp=q.poll();
                pq.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
            al.add(pq.poll());
        }
        return al;
    }
}