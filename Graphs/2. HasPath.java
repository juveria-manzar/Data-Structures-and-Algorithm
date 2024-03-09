import java.util.*;

class HasPath {

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

    public static void addEdge(int u, int v, int wt, ArrayList<Edge>[] graph) {
        Edge e1 = new Edge(u, v, wt);
        Edge e2 = new Edge(v, u, wt);

        graph[u].add(e1);
        graph[v].add(e2);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int vertices = scn.nextInt();
        int edges = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graph[i]=new ArrayList<Edge>();
        }
        while (edges > 0) {

            int u = scn.nextInt();
            int v = scn.nextInt();
            int wt = scn.nextInt();

            addEdge(u, v, wt, graph);
            edges--;
        }

        int src = scn.nextInt();
        int dest = scn.nextInt();
        boolean[] visited = new boolean[vertices];

        boolean pathExists = hasPath(src, dest, graph, visited);
        System.out.println(pathExists);
    }
    
    public static boolean hasPath(int src, int dest, ArrayList<Edge>[] graph, boolean[] visited) {
        
        //self check
        if (src == dest) {
            return true;
        }

        //mark
        visited[src] = true;

        //go to unvisited neighbours
        for (Edge ne : graph[src]) {
            int nbr = ne.v;

            if (visited[nbr] == false) {
                boolean nbrHasPath = hasPath(nbr, dest, graph, visited);

                if (nbrHasPath == true) {
                    return true;
                }
            }
        }

        return false;
    }
}