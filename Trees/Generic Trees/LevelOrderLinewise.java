import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderLinewise {
    private static class Node{
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data=data;
            children =new ArrayList<>();
        }
    }

    private static construct(int data){
        Stack<Node> st=new Stack<>();
        Node root=null;

        if(st.peek()==-1){
            st.pop();
        }else{
            Node child=new Node(data);
            if(st.size()==0){
                root=child;
            }
            else{
                Node parent=st.peek();
                parent.children.add(child);
            }
            st.push(child);
        }

    } 

    public static void main(String[] args) {
        
    }

}
