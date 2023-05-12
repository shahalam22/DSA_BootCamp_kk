import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    //Graph Traversal 1. BFS [Breadth First Search], 2. DFS [Depth First Search]

    //[Breadth First Search] -- traverse all the neighbouring nodes first. Indirect level order traversal [Tree er jonno ek level er sob node age print kora then mew level e probesh kora]
    //we will use QUEUE data structure to do BFS & will use graph - 2

    /*graph - 2
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

    //time complexity = O(V+E)

    //normal BFS when there is no disconnected component in the graph
    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr);
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.end);
                }
            }
        }
    }

    //if there exist any disconnected component in the graph
    public static void bfsDIS(ArrayList<Edge> graph[], int V, boolean[] vis, int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr);
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.end);
                }
            }
        }

    }

    public static void main(String[] args) {
        int V = 7;

        boolean[] vis = new boolean[V];

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        //normal bfs when there is no disconnected component in the graph
//        bfs(graph, V);

        //if there exist any disconnected component in the graph
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                bfsDIS(graph, V, vis , i);
            }
        }
    }

}
