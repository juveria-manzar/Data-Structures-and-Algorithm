import java.util.*;

public class GenericTrees {
    public static class Node {
        int data;
        ArrayList<Node> children;

        Node() {

        }

        Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    public static Node construct(int[] data) {
        Stack<Node> st = new Stack<>();
        Node root = null;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == -1) {
                st.pop();
            } else {
                Node newNode = new Node(data[i]);
                if (st.size() > 0) {
                    Node parent = st.peek();
                    parent.children.add(newNode);
                } else {
                    root = newNode;
                }

                st.push(newNode);
            }
        }
        return root;
    }

    public static void display(Node node) {
        System.out.print(node.data+"->");
        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);
            System.out.print(child.data+" ");
        }

        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);
            display(child);
        }
    }

    public static int size(Node node) {
        int totalSize=0;
        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);

            int childSize=size(child);

            totalSize+=childSize;
        }
        return totalSize+1;
    }

    public static int maxInGeneric(Node node) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);

            int childMax=maxInGeneric(child);

            max=Math.max(childMax,max);
        }

        max=Math.max(node.data, max);

        return max;
    }

    public static int height(Node node){
        int height=-1;

        for(int i=0;i<node.children.size();i++){
            Node child=node.children.get(i);
            int childHeight=height(child);

            height=Math.max(childHeight, height);
        }
        return height+1;
    }

    public static void main(String[] args) {
        int[] data = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = construct(data);

        // display(root);

        System.out.println(maxInGeneric(root));
        System.out.println(height(root));

        System.out.print(root.data + " " + root.children.size());
    }
}
