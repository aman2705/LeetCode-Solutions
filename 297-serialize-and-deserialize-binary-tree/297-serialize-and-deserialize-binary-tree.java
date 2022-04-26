/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return " ";
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        StringBuilder sb=new StringBuilder();
        
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            
            if(temp==null)
            {
                sb.append("#"+"aman");
                continue;
            }
            sb.append(temp.val+"aman");
            q.add(temp.left);
            q.add(temp.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==" ")
            return null;
        String values[]=data.split("aman");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode parent=new TreeNode(Integer.parseInt(values[0]));
        q.add(parent);
        int start=1;
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            if(!values[start].equals("#"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(values[start]));
                temp.left=left;
                q.add(left);
            }
            start++;
            if(!values[start].equals("#"))
            {
                TreeNode right=new TreeNode(Integer.parseInt(values[start]));
                temp.right=right;
                q.add(right);
            }
            start++;
            
        }
        return parent;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));