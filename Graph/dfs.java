import java.util.ArrayList;

public class dfs {

    //Graph Traversal 1. BFS [Breadth First Search], 2. DFS [Depth First Search]

    //[Depth First Search] -- traverse all the nodes of same branch first. Indirect branch order traversal [Tree er jonno ekta branch er sob node age print kora then mew branch e probesh kora]
    //RECURSION uses DFS process traversal. We will use Recursion here.

    static class Edge{
        int src;
        int end;
        public Edge(int src, int end){
            this.src = src;
            this.end = end;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    /*
    graph - 2
                0
               / \
              1   2
              |   |
              3---4
               \ /
                5
                |
                6
    */

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis){
        if(vis[curr] == true) return;

        System.out.println(curr);
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            dfs(graph, e.end, vis);
        }
    }

    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge> graph[] = new ArrayList[V];

        boolean[] vis = new boolean[V];

        createGraph(graph);

        //if there exist no disconnected component in the graph
//        dfs(graph, 0, vis);

        //if there exist any disconnected component in the graph
        for(int i=0; i<V; i++){
            if(vis[i] == false){
                dfs(graph, i, vis);
            }
        }
    }

}
