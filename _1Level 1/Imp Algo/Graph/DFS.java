import java.util.*;

public class DFS {

    public static class Node {
        int data;
        ArrayList<Node> children;

        Node() {
        }

        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public static Node construct(int[] data) {
        Stack<Node> st = new Stack<>();
        Node root = null;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == -1) {
                st.pop();
            }

            Node newNode = new Node(data[i]);
            if (st.size() == 0) {
                root = data[i];
            } else {
                st.push(newNode);
            }

        }
    }

    public static ArrayList<Integer> dfsTraversal(Node node, ArrayList<Integer> al) {
        if (node == null) {
            return new ArrayList<>();
        }
        al.add(node.data);
        for (Node child : node.children) {
            dfsTraversal(child, al);
        }
        return al;
    }

    public static void main(String[] args) {
        int[] data = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = construct(data);
        System.out.println(root.data);
        System.out.println(dfsTraversal(root, new ArrayList<>()));

    }
}
