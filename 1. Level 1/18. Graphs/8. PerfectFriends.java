import java.io.*;
import java.util.*;

class PerfectFriends {
    
    public static int perfectFriends(ArrayList<Integer>[] graph){
        boolean[] vis =new boolean[graph.length];
        ArrayList<Integer> ansList = getConnectedComponents(graph, vis);
        
        int ans=0;
        for(int i=0;i<ansList.size();i++){
            for(int j=i+1;j<ansList.size();j++){
                int s1 = ansList.get(i);
               int s2 = ansList.get(j);
               
               ans += s1*s2;
            }
        }
        
        return ans;
    }
   
   public static ArrayList<Integer> getConnectedComponents(ArrayList<Integer>[] graph, boolean[] vis){
       
       ArrayList<Integer> ans=new ArrayList<Integer>();
       for(int i=0;i<graph.length;i++){
           if(!vis[i]){
               ArrayList<Integer>scc = new ArrayList<>(); 
               getSingleConnectedComp(graph, vis,i, scc);
               ans.add(scc.size());
           }
       }
       
       return ans;
   }

    public static void getSingleConnectedComp(ArrayList<Integer>[] graph, boolean[] vis, int src,  ArrayList<Integer> list){
        vis[src]=true;
        list.add(src);
       for(int nbr: graph[src]){
           if(!vis[nbr]){
               getSingleConnectedComp(graph, vis, nbr, list);
           }
       }
    }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vertices = Integer.parseInt(br.readLine());
      int edges = Integer.parseInt(br.readLine());
      
      // construct graph
      ArrayList<Integer> [] graph = new ArrayList[vertices];
      
      for(int i=0;i<vertices;i++){
          graph[i]=new ArrayList<>();
      }
      
      while(edges-->0){
          String input = br.readLine();
          String[] arr=input.split(" ");
          int u = Integer.parseInt(arr[0]);
          int v = Integer.parseInt(arr[1]);
          
          graph[u].add(v);
          graph[v].add(u);
      }
      
      int ways = perfectFriends(graph);
      System.out.println(ways);
   }

}