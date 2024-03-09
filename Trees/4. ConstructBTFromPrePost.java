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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        
        TreeNode root=helper(preorder,0,n-1,postorder,0,n-1);
        return root;
        
    }
    
    public static TreeNode helper(int[] pr, int prs, int pre, int[] po, int pos, int poe){
        if(pos>poe){
            return null;
        }
        
        if(prs==pre){
            return new TreeNode(pr[prs]);
        }
        TreeNode node=new TreeNode(pr[prs]);
        
        int val=pr[prs+1];
        int idx=-1;
        
        for(int i=pos;i<=poe;i++){
            if(po[i]==val){
                idx=i;
                break;
            }
        }
        
        int cls=idx-pos+1;
        node.left=helper(pr,prs+1,prs+cls,po,pos,idx);
        node.right=helper(pr,prs+cls+1,pre,po,idx+1,poe-1);
        
        return node;
        
    }