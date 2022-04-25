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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        int count[]=new int[1];
        HashMap<Integer,String> hm=new HashMap<>();
        traverse(root,null,hm,x,y,count);
        if(hm.containsKey(x) && hm.containsKey(y))
        {
           if(hm.get(x).equals(hm.get(y)))
               {
                   return false;
               }
                
             else
               {
                   String arr[]=hm.get(x).split("aman");
                   String arr1[]=hm.get(y).split("aman");
                 // System.out.println(Arrays.toString(arr));
                 // System.out.println(Arrays.toString(arr1));
                   if(Integer.parseInt(arr[0])==Integer.parseInt(arr1[0]))
                       return false;
                   else if(Integer.parseInt(arr[0])!=Integer.parseInt(arr1[0]) && 
                          Integer.parseInt(arr[1])==Integer.parseInt(arr1[1]))
                       return true;
                   else
                       return false;
               } 
             
      }
            return false;  
    }
    private static int traverse(TreeNode root,TreeNode parent,HashMap<Integer,String> hm,int x,int y,int count[])
    {
        if(root==null)
            return 0;
        if(root.val==x || root.val==y)
        {
            if(parent==null)
                hm.put(root.val,-1+"aman"+count[0]);
            else
                hm.put(root.val,parent.val+"aman"+count[0]);
        }
            
        count[0]++;
        int left=traverse(root.left,root,hm,x,y,count);
        int right=traverse(root.right,root,hm,x,y,count);
        count[0]--;
        return 1+Math.max(left,right);
    }
}