/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        
        ArrayDeque<Node> q= new ArrayDeque<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            Node nextRight=null;
            while(size-->0){
                Node head= q.remove();
                head.next=nextRight;
                nextRight=head;
                
                if(head.right!=null){
                    q.add(head.right);
                }
                
                if(head.left!=null){
                    q.add(head.left);
                }
            }
        }
        
        return root;
        
    }
}