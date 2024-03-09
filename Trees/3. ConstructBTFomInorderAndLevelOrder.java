// { Driver Code Starts
    import java.util.*;

    class Node
    {
        int data;
        Node left, right;
        
        Node(int item)
        {
            data = item;
            left = right = null;
        }    
            public void setLeft(Node left) 
        {
            this.left = left;
        }
      
        public void setRight(Node right) 
        {
            this.right = right;
        }
            
        
    }
    
    
    class ConstructBT
    {
        Node root;
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                
                int inord[] = new int[n];
                int level[] = new int[n];
                for(int i = 0; i < n; i++)
                    inord[i] = sc.nextInt();
                    
                for(int i = 0; i < n; i++)
                     level[i] = sc.nextInt();
                     
                GfG g = new GfG();
                Node node =  g.buildTree(inord, level);
                printPreOrder(node);
                System.out.println();
                
                
            }
        }
        
       static void printPreOrder(Node node)
       {
           if(node == null)
              return;
              
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
       }
    }
    // } Driver Code Ends
    
    
    /*Please note that it's Function problem i.e.
    you need to write your solution in the form of Function(s) only.
    Driver Code to call/invoke your function is mentioned above.*/
    
    /*Complete the function below*/
    class GfG
    {
        HashMap<Integer,Integer> map;
        Node buildTree(int in[], int level[])
        {
            map=new HashMap<>();
            
            for(int i=0;i<in.length;i++){
                map.put(in[i],i);
            }
            int n=in.length;
            Node root=helper(in,level, 0,n-1);
            return root;
        }
        
        public Node helper(int[] in, int[] level, int is, int ie){
            
            if(is>ie){
                return null;
            }
            
            Node node=new Node(level[0]);
            int k=map.get(node.data);
            
            int ls=k-is;
            int rs=ie-k;
            
            int[] llo=new int[ls];
            int[] rlo=new int[rs];
            
            int p=0,q=0;
            
            for(int i=1;i<level.length;i++){
                int idx=map.get(level[i]);
                
                if(idx<k){
                    llo[p++]=level[i];
                }
                
                else if(idx>k){
                    rlo[q++]=level[i];
                }
            }
            
            
            node.left=helper(in,llo,is,k-1);
            node.right=helper(in,rlo,k+1,ie);
            
            return node;
        }
        
       
    }
    
    
    