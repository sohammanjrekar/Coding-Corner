package Graph;

import java.util.ArrayList;

public class allpathsfromStoD {
    static class edge {
        int source;
        int destination;

        public edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));
        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));
        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));
        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));
        graph[6].add(new edge(6, 5));
    }

    public static void dfs1(ArrayList<edge> graph[], int curr, boolean visited[], int target, String path) {
        if (curr == target) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!visited[e.destination]) {
                visited[curr] = true;
                dfs1(graph, e.destination, visited, target, path + e.destination);
                visited[curr] = false;
            }
        }
    }

    public static void display(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.println(graph[i].get(j).source + "  :  " + graph[i].get(j).destination);
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        // display(graph);
        creategraph(graph);
        boolean visited[] = new boolean[v];

        dfs1(graph, 0, visited, 5, "0");

        System.out.println();

    }
}
