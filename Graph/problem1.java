// All paths from the given source to given target

import java.util.ArrayList;

public class problem1 {

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

    public static void dfs(ArrayList<Edge> graph[], boolean[] vis, int curr, int target, String path){
        if(curr == target){
            System.out.println(path+curr);
            return;
        }

        vis[curr] = true;
        path = path+curr;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.end]==false){
                dfs(graph, vis, e.end, target, path);
            }
        }

        vis[curr] = false;
    }

    public static void main(String[] args) {
        int V = 7, s = 0, e = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean[] vis = new boolean[V];
        createGraph(graph);
        dfs(graph, vis, s, e, "");
    }
}
