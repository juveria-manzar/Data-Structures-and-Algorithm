import java.util.*;

public class BreadthFirstTraversal {

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

    public static class Pair{
        int vertex;
        String psf;

        Pair(){}

        Pair(int vertex, String psf){
            this.vertex=vertex;
            this.psf=psf;
        }
    }

    public static void bfs(int src,ArrayList<Edge>[]  graph){
        ArrayDeque<Pair> q=new ArrayDeque<>();

        boolean[] visited=new boolean[graph.length];

        q.add(new Pair(src,src+""));

        while(q.size()>0){
            //remove
            Pair rem=q.remove();

            //mark*
            if(visited[rem.vertex]==true){
                continue;
            }
            visited[rem.vertex]=true;

            //work
            System.out.println(rem.vertex+"@"+rem.psf);

            //add unvisted neihbours
            for(Edge ne:graph[rem.vertex]){
                int nbr=ne.nbr;
                if(visited[nbr]==false){
                    q.add(new Pair(nbr,rem.psf+nbr));
                }
            }
        }
    }


    public static void bfsLineWise(int src,ArrayList<Edge>[]  graph){
        // boolean[] vis=new boolean[graph.length];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int vertices = scn.nextInt();
        int edges = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        //null references of List @ each index of graph i.e.-> graph[i]=null

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

        int src=scn.nextInt();

        bfs(src,graph);

        bfsLineWise(src,graph);
    }

    public static void addEdge(ArrayList<Edge>[]graph,int u,int v,int wt){

        Edge e1=new Edge(u,v,wt);
        Edge e2=new Edge(v,u,wt);

        graph[u].add(e1);
        graph[v].add(e2);

    }
}

// 7 8
// 0 2 10
// 0 3 10
// 1 2 10
// 1 3 30
// 3 4 2
// 4 5 3
// 5 6 3
// 4 6 8