import Construct.Node;

/**
 * Definition for a binary tree node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class RemoveNode {
    public static removeNode(Node node,int data){
        if(node==null){
            return null;
        }

        if(node.data<data){
            node.right=remove(node.right,data);
        }
        else if(node.data>data){
            node.left=remove(node.left,data);
        }
        else{
            if(node.left==null&& node.right==null){
                //leaf node hai
                return null;
            }else if(node.left==null){
                //right child exists
                return node.right;
            }else if(node.right==null){
                return node.left;
            }
            else{
                //both child exists
                int lmax=max(node.left);
                node.data=lmax;
                node.left=remove(node.left,lmax);
            }
        }
        return node;
    }
}
