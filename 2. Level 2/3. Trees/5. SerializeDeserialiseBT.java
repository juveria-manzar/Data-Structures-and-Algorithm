/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "*";
        }
        
        String la=serialize(root.left);
        String ra=serialize(root.right);
        
        return root.val+" "+la+" "+ra;
    }

    int k;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        k=0;
        String[] arr=data.split(" ");
        return helper(arr);
    }
    
    public TreeNode helper(String[] arr){
        if(arr[k].equals("*")==true){
            k++;
            return null;
        }else{
            int data=Integer.parseInt(arr[k]);
            k++;
            
            TreeNode node=new TreeNode(data);
            
            node.left=helper(arr);
            node.right=helper(arr);
            return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));