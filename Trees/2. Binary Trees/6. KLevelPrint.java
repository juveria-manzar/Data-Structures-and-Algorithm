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

  public static boolean find(Node node, int data){
    if(node==null){
        return false;
    }
    
    if(node.data==data){
        return true;
    }
    if(find(node.left,data)){
        return true;
    }else if(find(node.right,data)){
        return true;
    }
    
    return false;
  }

//Level Order linewise approach

/*  public static ArrayList<Integer> nodeToRootPath(Node node, int k){
      
    Queue<Node> q=new ArrayDeque<>();
    q.add(node);

    int level=0;

    while(q.size()>0){

        if(level==k){
            break;
        }

        int count=q.size();

        for(int i=0;i<count;i++){
            //remove
            Node rem=q.remove();

            //add children
            if(rem.left!=null){
                q.add(rem.left);
            }

            if(rem.right!=null){
                q.add(rem.right);
            }
        }

        level++;
    }

    while(q.size()>0){
        System.out.println(q.remove().data);
    }
  }*/

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
      
    if(node==null){
        return new ArrayList<>();
    }
    if(node.data==data){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(node.data);
        return ans;
    }
    
    ArrayList<Integer> n2lcp = nodeToRootPath(node.left, data); //node to left child path
    
    if(n2lcp.size()>0){
        n2lcp.add(node.data); //converting n2lcp to root path
        return n2lcp;
    }
    
    ArrayList<Integer> n2rcp=nodeToRootPath(node.right, data); //node to right child path
    
    if(n2rcp.size()>0){
        n2rcp.add(node.data); //converting n2rcp to root path
        return n2rcp;
    }
    
    return new ArrayList<>(); //not found in left or right
    
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

    Node root = construct(arr);
    boolean found = find(root, data);
    System.out.println(found);

    ArrayList<Integer> path = nodeToRootPath(root, data);
    System.out.println(path);
  }

}