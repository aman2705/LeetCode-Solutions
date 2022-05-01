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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        traverse(root,hm);
        int freq=0;
        // int ans=0;
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)>freq)
            {
                freq=hm.get(i);
                // ans=i;
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(Integer i:hm.keySet())
        {
            if(hm.get(i)==freq)
                al.add(i);
        }
        int ans[]=new int[al.size()];
        for(int i=0;i<ans.length;i++)
            ans[i]=al.get(i);
        return ans;
    }
    private static void traverse(TreeNode root,HashMap<Integer,Integer> hm)
    {
        if(root==null)
            return;
        
        traverse(root.left,hm);
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        traverse(root.right,hm);
    }
}