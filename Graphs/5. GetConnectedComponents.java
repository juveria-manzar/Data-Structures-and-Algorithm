import java.lang.reflect.Array;
import java.util.*;

class GetConnectedComponents {
    public static class Edge {
        int u;
        int v;
        int wt;

        Edge() {
        }

        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
    }

    public static ArrayList<ArrayList<Integer>> getConnectedComponents(ArrayList<Edge> [] graph){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];
        for(int v=0; v<graph.length; v++){
            if(!vis[v]){
                ArrayList<Integer> list = new ArrayList<>();
                getSingleConnectedComponents(graph, v, vis, list);
                ans.add(list);
            }
        }

        return ans;
    }

    public static void getSingleConnectedComponents(ArrayList<Edge> [] graph, int src, boolean[] vis, ArrayList<Integer> list){
        vis[src]=true;
        list.add(src);

        for(Edge ne: graph[src]){
            int nbr = ne.v;
            if(!vis[nbr]){
                getSingleConnectedComponents(graph, nbr, vis, list);
            }
        }
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int vertices = scn.nextInt(); // no of vertices
        int edges = scn.nextInt(); // no of edges

        ArrayList<Edge>[] graph= new ArrayList[vertices];

        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<>();
        }

        while(edges-->0){
            int u = scn.nextInt();
            int v = scn.nextInt();
            int wt = scn.nextInt();
            Edge e1 = new Edge(u, v, wt);
            Edge e2 = new Edge(v, u, wt);

            graph[u].add(e1);
            graph[v].add(e2);
        }
        
        ArrayList<ArrayList<Integer>> components = getConnectedComponents(graph);
        System.out.println(components);
    }

}
