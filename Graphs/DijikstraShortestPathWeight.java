
/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-09 02:24:20
 * @modify date 2021-08-09 02:24:20
 * @desc 
 * 1. Given a graph and a source vertex. The vertices represent cities and the edges represent 
    distance in kms.
 * 2. You are required to find the shortest path to each city (in terms of kms) from the source city along 
    with the total distance on path from source to destinations.


    Application of BFS & Priority Queue
    
 */

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DijikstraShortestPathWeight {
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

    public static class Pair implements Comparable<Pair> {
        int vertex;
        String psf;
        int wsf;

        Pair() {

        }

        Pair(int vertex, String psf, int wsf) {
            this.vertex = vertex;
            this.psf = psf;
            this.wsf = wsf;
        }

        public int compareTo(Pair o) {
            // 0 ->equal
            // - ->chota ho this se
            // + -> bada ho this se

            return this.wsf - o.wsf;
        }
    }

    public static void shortestPathWeight(int src, ArrayList<Edge>[] graph) {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        boolean[] visited = new boolean[graph.length];

        q.add(new Pair(src, src + "", 0));

        while (q.size() > 0) {
            // remove
            Pair rem = q.remove();

            // mark* visit the unvisited vertex
            if (visited[rem.vertex] == true) {
                continue;
            }
            visited[rem.vertex] = true;

            // work
            System.out.println(rem.vertex + " via " + rem.psf + " @ " + rem.wsf);

            // add*
            for (Edge ne : graph[rem.vertex]) {
                int nbr = ne.v;
                if (visited[nbr] == false) {
                    q.add(new Pair(nbr, rem.psf + nbr, rem.wsf + ne.wt));
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int vertices = scn.nextInt();
        int edges = scn.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        while (edges > 0) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            int wt = scn.nextInt();

            addEdge(u, v, wt, graph);
            edges--;
        }

        int src = scn.nextInt();
        shortestPathWeight(src, graph);
    }

    public static void addEdge(int u, int v, int wt, ArrayList<Edge>[] graph) {
        Edge e1 = new Edge(u, v, wt);
        Edge e2 = new Edge(v, u, wt);

        graph[u].add(e1);
        graph[v].add(e2);
    }
}
