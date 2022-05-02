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
    public TreeNode bstFromPreorder(int[] preorder) {
       
        int inorder[]=new int[preorder.length];
        for(int i=0;i<inorder.length;i++)
            inorder[i]=preorder[i];
        
        Arrays.sort(inorder);
        // System.out.println(Arrays.toString(inorder));
        // System.out.println(Arrays.toString(preorder));
        // return null;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        TreeNode root=constructTree(inorder,0,inorder.length-1,
                                   preorder,0,preorder.length-1,hm);
        return root;
    }
    private static TreeNode constructTree(int inorder[],int instart,int inend,
                                          int preorder[],int prestart,int preend
                                          ,HashMap<Integer,Integer> hm)
    {
        if(instart>inend || prestart>preend)
            return null;
        
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot = hm.get(root.val);
        int numsleft = inroot - instart;
        root.left=constructTree(inorder,instart,inroot-1,
                               preorder,prestart+1,prestart+numsleft,hm);
        root.right=constructTree(inorder,inroot+1,inend,
                                preorder,prestart+numsleft+1,preend,hm);
        return root;
    }
        
}