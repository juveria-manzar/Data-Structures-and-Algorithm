import java.util.*;

/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-09 00:38:57
 * @modify date 2021-08-09 00:38:57
 * @desc Application of BFS linewise level order traversal infections spread to
 *       neighnours at the. 1. given people and their neighnours. 2. given a src
 *       person (who got infected) and time t 3. You are required to find how
 *       many people will get infected in time t, if the infection spreads to
 *       neighbors of infected person in 1 unit of time.
 */

// src-person and the given time!
// tells us that we need to create a queue that holds <SRC,TIME>

public class SpreadInfection {

    public static class Edge {
        int u;
        int v;

        Edge() {
        }

        Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }

    public static class Pair {
        int vertex;
        int time;

        Pair() {
        }

        Pair(int vertex, int time) {
            this.vertex = vertex;
            this.time = time;
        }
    }

    public static int spreadOfInfectionCount(int src, int time, ArrayList<Edge>[] graph) {
        ArrayDeque<Pair> q = new ArrayDeque<>();

        boolean[] visited = new boolean[graph.length];

        int count = 0;// no. of people infected
        q.add(new Pair(src, 1));

        while (q.size() > 0) {
            // remove
            Pair rem = q.remove();

            // mark* visit unvisted vertex
            if (visited[rem.vertex] == true) {
                continue;
            }

            visited[rem.vertex] = true;

            // work
            if (rem.time > time) {
                break;
            } else {
                count++;
            }

            // add* add unviisted neighbours
            for (Edge ne : graph[rem.vertex]) {
                int nbr = ne.v;
                if (visited[nbr] == false) {
                    q.add(new Pair(nbr, rem.time + 1));
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int vertices = scn.nextInt();
        int edges = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        while (edges > 0) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            addEdge(u, v, graph);
            edges--;
        }

        int src = scn.nextInt();
        int time = scn.nextInt();

        int count = spreadOfInfectionCount(src, time, graph);
        System.out.println("Number of people Infected: "+count);
    }

    public static void addEdge(int u, int v, ArrayList<Edge>[] graph) {
        Edge e1 = new Edge(u, v);
        Edge e2 = new Edge(v, u);

        graph[u].add(e1);
        graph[v].add(e2);
    }
}
