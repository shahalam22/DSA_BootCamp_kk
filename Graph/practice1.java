import java.util.ArrayList;
import java.util.Scanner;

public class practice1 {

    //node of graph = vertex || link between nodes = edge
    //we will use graph for Map, Social Media, Delivery Network

    //creating edge
    static class edge{
        int src;
        int end;
        int weight;
        //constructor with source & end-point
        public edge(int src, int end){
            this.src = src;
            this.end = end;
        }
        //constructor with source, end-point & weight
        public edge(int src, int end, int weight){
            this.src = src;
            this.end = end;
            this.weight = weight;
        }
    }

    // This process of creating graph is called "Adjacency List" [List of Lists] . Except this we also can create graph using "Adjacency Matrix", "Edge List", "2D Matrix (Implicit Graph)"
    //used graph-1 here
    public static void createGraph(ArrayList<edge> graph[]){
        //ekhane by default null value store kora. So, amra null ke arrayList diye replace na kore directly value input dite gele error dekhabe
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<edge>();
        }

        graph[0].add(new edge(0,2,2));

        graph[1].add(new edge(1,2,10));
        graph[1].add(new edge(1,3,0));

        graph[2].add(new edge(2,0,2));
        graph[2].add(new edge(2,1,10));
        graph[2].add(new edge(2,3,-1));

        graph[3].add(new edge(3,1,0));
        graph[3].add(new edge(3,2,-1));

        /* graph - 1
                    0
                   /
                  2---3
                   \ /
                    1
        */
    }

    //presenting graph using adjacency Matrix. Matrix er kono index [i][j] [where i = row, j = column] e jodi element 0 hoy tahole oi i & j node er moddhe kono edge nai. ar jodi element 1 hoy tahole ekhane ekta edge ache [edge k 1 er poriborte weight number diyeo denote kora jete pare (if weight exist in the edge)]
    //it is not recommended because it takes additional spaces O(V^2). If we wants to find out any edge it will take O(V) time.
    //used graph-1 here
    public static int[][] createGraph2(){
        Scanner input = new Scanner(System.in);

        int[][] graph = new int[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                graph[i][j] = input.nextInt();
            }
        }
        return graph;
    }

    //in the "EDGE LIST" process we makes a list of edges and then use this for applying the operations over the graph
    //we use this "EDGE LIST" process to solve minimum spanning tree problem.

    public static void main(String[] args) {

        //used graph-1 here
        int V = 4;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //printing 2's neighbour [Adjacency List type]
        for(int i=0; i<graph[2].size(); i++){
            edge uno = graph[2].get(i);
            System.out.println(uno.end+" , "+uno.weight);
        }
    }
}
