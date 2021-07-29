import java.io.*;
import java.util.*;

public class Size_Sum_Max_height {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
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

  public static int size(Node node) {
    if (node == null) {
      return 0;
    }

    int leftSize = size(node.left);
    int rightSize = size(node.right);

    return leftSize + rightSize + 1;
  }

  public static int sum(Node node) {
    if (node == null) {
      return 0;
    }

    int leftSum = sum(node.left);
    int rightSum = sum(node.right);

    return leftSum + rightSum + node.data;
  }

  public static int max(Node node) {
    if (node == null) {
      return Integer.MIN_VALUE;
    }

    int lcMax=max(node.left);
    int rcMax=max(node.right);

    return Math.max(Math.max(lcMax,rcMax),node.data);
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int leftChildHeight = height(node.left);
    int rightChildHeight = height(node.right);

    return Math.max(leftChildHeight, rightChildHeight) + 1;

  }

  static String pre;
  static String in;
  static String post;

  public static void traversal(Node node) {

    if (node == null) {
      return;
    }

    pre += (node.data + " ");// pre
    traversal(node.left);// ;left call
    in += (node.data + " ");
    traversal(node.right);// right call
    post += (node.data + " ");

    
  }

  public static void main(String[] args) throws Exception {
    int[] arr = { 10, 20, -1, 40, 60, -1, -1, 70, -1, -1, 30, 50, -1, -1, -1 };

    Node root = construct(arr);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int ht = height(root);
    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(ht);

    in = "";
    pre = "";
    post = "";
    traversal(root);
    System.out.println("Pre "+pre);
    System.out.println("Post "+post);
    System.out.println("Inorder "+in);
  }

}