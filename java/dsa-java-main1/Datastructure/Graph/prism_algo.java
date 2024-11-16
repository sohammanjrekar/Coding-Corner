package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prism_algo {
    static class edge {
        int source;
        int destination;
        int weight;

        public edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));
        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));
        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prismalgo(ArrayList<edge> graph[], int v) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // non mst
        boolean visited[] = new boolean[v];// mst
        pq.add(new Pair(0, 0));
        int mstCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                mstCost += curr.cost;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    edge e = graph[curr.node].get(i);
                    if (!visited[e.destination]) {
                        pq.add(new Pair(e.destination, e.weight));
                    }
                }
            }
        }
        System.out.println("Minimum cost of mst : " + mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        prismalgo(graph, v);
    }
}
