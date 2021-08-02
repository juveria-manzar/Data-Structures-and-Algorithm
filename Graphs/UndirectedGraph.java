import java.util.*;

public class UndirectedGraph {

    public static class Edge {
        int src;
        int nbr;
        int wt;
        Edge() {

        }

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int vertices = scn.nextInt();
        int edges = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];//null references of List @ each index of graph i.e.-> graph[i]=null

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();//new referneces of List @ each index of Graph
        }

        while (edges > 0) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            int weight = scn.nextInt();

            addEdge(graph,u,v,weight);
            edges--;
        }

        display(graph);
    }

    public static void addEdge(ArrayList<Edge>[]graph,int u,int v,int wt){

        Edge e1=new Edge(u,v,wt);
        Edge e2=new Edge(v,u,wt);

        graph[u].add(e1);
        graph[v].add(e2);

    }

    public static void display(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            System.out.print(i+" ->");

            for(Edge ne:graph[i]){
                int src=i;
                int nbr=ne.nbr;
                int weight=ne.wt;

                System.out.print(src+" - "+nbr+" @ "+weight);
            }
            System.out.println();
        }
    }
}