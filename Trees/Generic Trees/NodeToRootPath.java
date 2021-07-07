import java.util.ArrayList;

import LinkedListReverse.Node;

public class NodeToRootPath {

    public static ArrayList<Integer> nodeToRootPath(Node node,int data){

        if(node.data==data){
            ArrayList<Integer> bl=new ArrayList<>();
            bl.add(node.data);
            return bl;
        }

        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);

            
        }
    }
    public static void main(String[] args) {
        
    }
}
