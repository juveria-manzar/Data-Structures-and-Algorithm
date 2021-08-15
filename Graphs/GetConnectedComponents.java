import java.util.*;

public class GetConnectedComponents {
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

    public static ArrayList<ArrayList<Integer>> getConnectedComponents(ArrayList<Edge>[] graph){
        ArrayList<ArrayList<Integer>> cc=new ArrayList<>();

        boolean[] vis=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(vis[i]==false){
                ArrayList<Integer> sc=new ArrayList<>();
                getSingleConnectedComponent(i,graph,vis,sc);
                cc.add(sc);
            }
        }

        return cc;
    }

    public static void getSingleConnectedComponent(int src,ArrayList<Edge>[] graph,boolean[] vis,ArrayList<Integer> sc){
        vis[src]=true;

        sc.add(src);

        for(Edge ne:graph[src]){
            int nbr=ne.v;
            if(vis[nbr]==false){
                getSingleConnectedComponent(nbr,graph,vis,sc);
            }
        }
    }



    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int vertices = scn.nextInt();
        int edges = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();// new referneces of List @ each index of Graph
        }

        while (edges > 0) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            int wt = scn.nextInt();

            Edge e1 = new Edge(u, v, wt);
            Edge e2 = new Edge(v, u, wt);

            graph[u].add(e1);
            graph[v].add(e2);
            edges--;
        }

        ArrayList<ArrayList<Integer>> components=getConnectedComponents(graph);
        System.out.println(components);
    }

}
