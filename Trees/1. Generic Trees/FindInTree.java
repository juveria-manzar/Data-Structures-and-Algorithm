import java.util.*;

public class FindInTree {
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

    // find
    public static boolean find(Node node, int data) {
        // self check
        if (node.data == data) {
            return true;
        }

        // faith on each child
        for (int i = 0; i < node.children.size(); i++) {
            Node child = node.children.get(i);

            boolean ificf = find(child, data); // is found in child family

            if (ificf == true) {
                return true;
            }
        }

        return false;

    }
}
