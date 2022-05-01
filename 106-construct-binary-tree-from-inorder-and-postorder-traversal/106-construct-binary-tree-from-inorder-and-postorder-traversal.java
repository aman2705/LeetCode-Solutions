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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<inorder.length;i++)
		{
			hm.put(inorder[i],i);
		}
		TreeNode root=constructTreehelper(inorder,0,inorder.length-1,
						   postorder,0,postorder.length-1,hm);
		return root;
    }
    private static TreeNode constructTreehelper(int inorder[],int instart,int inend,int postorder[],int poststart,int postend,HashMap<Integer,Integer> hm)
	{
		if(instart>inend|| poststart>postend)
		{
			return null;
		}
		TreeNode root=new TreeNode(postorder[postend]);
		int inroot=hm.get(postorder[postend]);
		int numsleft=inroot-instart;
		
		root.left=constructTreehelper(inorder,instart,inroot-1,
					 postorder,poststart,poststart+numsleft-1,hm);
		root.right=constructTreehelper(inorder,inroot+1,inend,
								 postorder,poststart+numsleft,postend-1,hm);
		return root;
	}
}