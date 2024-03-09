import java.io.*;
import java.util.*;

class Main {
  public static void printSingleChildNodes(Node node, Node parent){
    helper(node);
  }
  
  public static void helper(Node node){
       if(node==null){
        return;
    }
    
    //leaf node
    if(node.left==null&& node.right!=null){
        System.out.println(node.right.data);
        return;
        
    }
    if(node.right==null&& node.left!=null){
        System.out.println(node.left.data);
        return;
    }
    
    helper(node.left);
    helper(node.right);
  }
}