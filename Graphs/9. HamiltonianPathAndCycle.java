import java.io.*;
import java.util.*;

class HamiltonianPathCycle {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

    public static void printHamiltonianPathCycle(ArrayList<Edge>[] graph, boolean[] vis, int orgsrc, int src, String psf){
        if(psf.length()==graph.length-1){
            psf+=src;
            
            boolean ishc=false;
            
            for(Edge ne: graph[orgsrc]){
                int nbr = ne.nbr;
                if(nbr==src){
                    ishc=true;
                }
            }
            System.out.print(psf);
            
            if(ishc){
                System.out.println("*");
            }else{
                System.out.println(".");
            }
            
        }
        
        vis[src]=true;
        for(Edge ne: graph[src]){
            int nbr= ne.nbr;
            if(!vis[nbr]){
                printHamiltonianPathCycle(graph, vis, orgsrc, nbr, psf+src);
            }
        }
        vis[src]=false;
    }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());

    boolean[] vis=new boolean[vtces];
      printHamiltonianPathCycle(graph, vis, src, src, "");
   }
}