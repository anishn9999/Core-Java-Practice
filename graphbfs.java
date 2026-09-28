import java.util.*;
public class graphbfs {
    static void BFS(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        Queue<Integer> queue =new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(! queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node+" ");
            for(int neighbour: graph.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int E =sc.nextInt();
        ArrayList<ArrayList<Integer>> graph =new ArrayList<>();
        for(int i=0; i<V;i++){
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter edges: ");
        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited= new boolean[V];
        System.out.println("BFS: ");
        

    }
}
