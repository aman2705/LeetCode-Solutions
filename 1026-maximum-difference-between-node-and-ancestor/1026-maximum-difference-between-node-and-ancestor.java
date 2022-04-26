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
    public int maxAncestorDiff(TreeNode root) {
        int count[]=new int[2];
        ArrayList<Integer> al=new ArrayList<>();
        dfs(root,al,count);
        return count[1];
    }
    private static void dfs(TreeNode root,ArrayList<Integer> al,int count[])
    {
        if(root==null)
            return ;
        if(count[0]!=0)
        {
            int max=al.get(0);
            int min=al.get(0);
            for(int i=1;i<al.size();i++)
            {
                max=Math.max(max,al.get(i));
                min=Math.min(min,al.get(i));
            }
            count[1]=Math.max(count[1],Math.max(Math.abs(root.val-min),Math.abs(root.val-max)));
        }
        
        al.add(root.val);
        count[0]++;
        dfs(root.left,al,count);
        dfs(root.right,al,count);
        al.remove(al.size()-1);
        count[0]--;
    }
}