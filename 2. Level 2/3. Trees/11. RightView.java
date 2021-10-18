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
    public List<Integer> rightSideView(TreeNode root) {
     
        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int count=q.size();
            
            ans.add(q.getLast().val);
            while(count-->0){
                TreeNode rem=q.remove();
                
                if(rem.left!=null){
                    q.add(rem.left);
                }
                
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
        }
        
        return ans;
    }
}