// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Main {
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            GFG obj = new GFG();
            Node tree = obj.constructBST(arr);
            preorder(tree);
            System.out.println();
        }
	}
	
	 public static void preorder(Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java


class GFG 
{
    static class Pair{
        int max;
        int min;
        Node par;
        
        Pair(){
            
        }
        
        Pair(Node par,int min,int max){
            this.par=par;
            this.min=min;
            this.max=max;
        }
    }
    //Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr)
    {
        ArrayDeque<Pair> q=new ArrayDeque<>();
        q.add(new Pair(null,Integer.MIN_VALUE,Integer.MAX_VALUE));
        
        Node root=null;
        int idx=0;
        while(q.size()>0&&idx<arr.length){
            Pair rem=q.remove();
            
            if(arr[idx]<rem.min||arr[idx]>rem.max){
                continue;
            }
            
            Node node=new Node(arr[idx]);
            idx++;
            
            if(rem.par==null){
                root=node;
            }else{
                if(node.data<rem.par.data){
                    rem.par.left=node;
                }else{
                    rem.par.right=node;
                }
            }
            
            q.add(new Pair(node,rem.min,node.data-1));
            q.add(new Pair(node,node.data+1,rem.max));
        }
        
        return root;
    }
}