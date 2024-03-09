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

  public static boolean find(Node node, int data) {
    if (node == null) {
      return false;
    }

    if (node.data == data) {
      return true;
    }
    if (find(node.left, data)) {
      return true;
    } else if (find(node.right, data)) {
      return true;
    }

    return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data) {

    if (node == null) {
      return new ArrayList<>();
    }
    if (node.data == data) {
      ArrayList<Integer> ans = new ArrayList<>();
      ans.add(node.data);
      return ans;
    }

    ArrayList<Integer> n2lcp = nodeToRootPath(node.left, data); // node to left child path

    if (n2lcp.size() > 0) {
      n2lcp.add(node.data); // converting n2lcp to root path
      return n2lcp;
    }

    ArrayList<Integer> n2rcp = nodeToRootPath(node.right, data); // node to right child path

    if (n2rcp.size() > 0) {
      n2rcp.add(node.data); // converting n2rcp to root path
      return n2rcp;
    }

    return new ArrayList<>(); // not found in left or right

  }
}