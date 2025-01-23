import java.util.*;
public class GRAPH1{
    static class Edge{
        int scr;
        int dest;
        int wgt;
        public Edge(int s, int d , int w){
            this.scr=s;
            this.dest=d;
            this.wgt = w;
         }
    }

    public static void creatGraph(ArrayList<Edge> graph[] ){
        for(int i = 0 ; i< graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 10));
        graph[1].add(new Edge(1, 2, 19));
        graph[1].add(new Edge(1, 3, 15));
        graph[2].add(new Edge(2, 0, 11));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 6));
        graph[3].add(new Edge(3, 1, 8));
        graph[3].add(new Edge(3, 2, 10));

    }
    public static void main(String[] args) {
        int V =4;
        
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        for(int i = 0; i< graph[1].size(); i++){
            Edge e = graph[1].get(i);
            System.out.print(e.scr+"->"+e.dest+"->"+e.wgt);
            System.out.println();
        }
    }
}