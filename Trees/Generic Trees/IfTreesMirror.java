import java.util.*;

public class IfTreesMirror {
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

    // are trees mirror
    public static boolean areMirror(Node n1, Node n2) {
        if (n1.children.size() != n2.children.size()) {
            return false;
        }

        for (int i = 0; i < n1.children.size(); i++) {
            Node c1 = n1.children.get(i);
            int s2 = n2.children.size();
            Node c2 = n2.children.get(s2 - i - 1);

            boolean areMirrorChild = areMirror(c1, c2);

            if (areMirrorChild == false) {
                return false;
            }

        }

        return true;

    }
}
