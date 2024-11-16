package Graph;

import java.util.ArrayList;

public class bellman_ford {
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
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));
        graph[1].add(new edge(1, 2, -4));
        graph[2].add(new edge(2, 3, 2));
        graph[3].add(new edge(3, 4, 4));
        graph[4].add(new edge(4, 1, -1));
    }

    public static void bellmanford(ArrayList<edge> graph[], int source, int v) {
        int distance[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (i != source) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < v - 1; i++) {// o(v)
            // o(E) both for loop
            for (int j = 0; j < v; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    edge e = graph[j].get(k);
                    int u = e.source;
                    int v1 = e.destination;
                    if (distance[u] != Integer.MAX_VALUE && distance[u] + e.weight < distance[v1]) {
                        distance[v1] = distance[u] + e.weight;
                    }
                }
            }
        }
        // detect negative cycle
        for (int j = 0; j < v; j++) {
            for (int k = 0; k < graph[j].size(); k++) {
                edge e = graph[j].get(k);
                int u = e.source;
                int v1 = e.destination;
                if (distance[u] != Integer.MAX_VALUE && distance[u] + e.weight < distance[v1]) {
                    System.out.println("Neative weighted cycle");
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        bellmanford(graph, 0, v);
    }
}
