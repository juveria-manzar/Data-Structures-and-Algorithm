import java.io.*;
import java.util.*;

class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
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

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void printKLevelsDown(Node node, int k, Node prhbt) {
        if (node == null || node == prhbt) {
            return;
        }

        if (k == 0) {
            System.out.println(node.data);
            return;
        }

        printKLevelsDown(node.left, k - 1, prhbt);
        printKLevelsDown(node.right, k - 1, prhbt);

    }

    public static ArrayList<Node> nodeToRootPath(Node node, int data) {
        if (node == null) {
            return new ArrayList<>();
        }

        if (node.data == data) {
            ArrayList<Node> ans = new ArrayList<>();
            ans.add(node);
            return ans;
        }

        ArrayList<Node> n2lcp = nodeToRootPath(node.left, data);

        if (n2lcp.size() > 0) {
            n2lcp.add(node);
            return n2lcp;
        }

        ArrayList<Node> n2rcp = nodeToRootPath(node.right, data);

        if (n2rcp.size() > 0) {
            n2rcp.add(node);
            return n2rcp;
        }

        return new ArrayList<>();

    }

    public static void printKNodesFar(Node root, int data, int k) {
        ArrayList<Node> n2rp = nodeToRootPath(root, data);

        Node prhbt = null;

        for (int i = 0; i < n2rp.size(); i++) {
            Node node = n2rp.get(i);
            printKLevelsDown(node, k - i, prhbt);
            prhbt = node;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        int data = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        printKNodesFar(root, data, k);
    }

}