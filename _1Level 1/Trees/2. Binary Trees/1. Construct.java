import java.util.*;

class Construct {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node() {

        }

        Node(int data) {
            this.data = data;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair() {

        }

        //state 0: root inserted->waiting for left
        //state 1: left inserted->waiting for right
        //state 2: right inserted-> to be popped
        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(int[] arr) {
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(new Pair(root, 0));

        int index = 1;

        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 0) {
                if (arr[index] != -1) {
                    Node node = new Node(arr[index]);
                    top.node.left = node;
                    st.push(new Pair(node, 0));
                }
                top.state++;
                index++;
            } else if (top.state == 1) {
                if (arr[index] != -1) {
                    Node node = new Node(arr[index]);
                    top.node.right = node;
                    st.push(new Pair(node, 0));
                }
                top.state++;
                index++;
            } else {
                st.pop();
            }
        }
        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = " <-" + node.data + " ->";
        String leftData = (node.left != null) ? (node.left.data + "") : (".");
        String rightData = (node.right != null) ? (node.right.data + "") : (".");

        System.out.println(leftData + str + rightData);
        display(node.left);
        display(node.right);
    }

    public static void main(String... s) {
        int[] arr = { 10, 20, -1, 40, 60, -1, -1, 70, -1, -1, 30, 50, -1, -1, -1 };

        Node root = construct(arr);

        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);

        display(root);

    }
}