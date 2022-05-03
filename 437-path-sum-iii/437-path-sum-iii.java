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
    public int pathSum(TreeNode root, int targetSum) {
      // thinking of using the prefix sum technique
        
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null && root.val!=targetSum)
            return 0;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count[]=new int[2];
        
        traverse(root,targetSum,hm,count);
        return count[1];
        
    }
    private static void traverse(TreeNode root,int targetSum,HashMap<Integer,Integer> hm,int count[]){
        if(root==null)
            return;
        
        count[0]=count[0]+root.val;
        if(hm.containsKey(count[0]-targetSum))
        {
            count[1]=count[1]+hm.get(count[0]-targetSum);
        }
        
        hm.put(count[0],hm.getOrDefault(count[0],0)+1);
        
        traverse(root.left,targetSum,hm,count);
        traverse(root.right,targetSum,hm,count);
        hm.put(count[0],hm.getOrDefault(count[0],0)-1);
        count[0]=count[0]-root.val;

    }
}