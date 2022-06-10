/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        
        HashMap<Node, Node> map =new HashMap<>();
        Queue<Node> q =new ArrayDeque<>();
        
        Node newNode = new Node(node.val);
        q.add(node);
        map.put(node, newNode);
        
        while(!q.isEmpty()){
            int qSize = q.size();
            while(qSize-->0){
                Node originalNode = q.remove();
                for(Node child: originalNode.neighbors){
                    if(!map.containsKey(child)){
                        Node newChild = new Node(child.val);
                        map.put(child, newChild);
                        q.add(child);
                    }
                    Node newListNode = map.get(originalNode);
                    newListNode.neighbors.add(map.get(child));
                }
            }
        }
        return map.get(node);
    }
}