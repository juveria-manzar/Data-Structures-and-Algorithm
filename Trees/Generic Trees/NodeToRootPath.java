import java.util.*;

public class NodeToRootPath {
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

    // node to root path
    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        // self check
        if (node.data == data) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }

        // faith on each child
        for (int i = 0; i < node.children.size(); i++) {
            Node child = node.children.get(i);

            ArrayList<Integer> n2cp = nodeToRootPath(child, data); // node to child path

            if (n2cp.size() > 0) {
                // data exists in child family
                n2cp.add(node.data); // node to child path -> node to root path
                return n2cp;
            }
        }

        return new ArrayList<>();

    }
}
