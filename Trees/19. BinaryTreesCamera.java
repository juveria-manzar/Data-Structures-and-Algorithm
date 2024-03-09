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
    static int camera=0;
    
    //1 -> covered by someone
    //0 -> has camera
    //-1 -> need to be covered
    public int helper(TreeNode root){
        if(root==null) return 1;
        
        int leftChildState=helper(root.left);
        int rightChildState=helper(root.right);
        
        if(leftChildState==-1||rightChildState==-1){
            camera++;
            return 0;
        }
        
        if(leftChildState==0||rightChildState==0){
            return 1;
        }
        
        return -1;
    }
    public int minCameraCover(TreeNode root) {
        camera = 0;
        if(helper(root)==-1) camera++;
        return camera;
    }
}