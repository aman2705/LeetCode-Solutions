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
class BSTIterator {

    ArrayList<TreeNode> al=new ArrayList<>();
    int index=0;
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
      
        
        
        return al.get(index++).val;
    }
    
    public boolean hasNext() {
        
        if(index<al.size())
            return true;
        return false;
    }
    private  void inorder(TreeNode root)
    {
        if(root==null)
            return;
        
        inorder(root.left);
        al.add(root);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */