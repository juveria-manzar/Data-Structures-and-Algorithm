import java.util.*;

public class IfTreesSimilar {
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

    // are trees similar
    public static boolean areSimilar(Node n1, Node n2) {
        // self check
        if (n1.children.size() != n2.children.size()) {
            return false;
        }

        for (int i = 0; i < n1.children.size(); i++) {
            Node c1 = n1.children.get(i);
            Node c2 = n2.children.get(i);

            boolean areSimilarChild = areSimilar(c1, c2);

            if (areSimilarChild == false) {
                return false;
            }
        }

        return true;
    }
}
