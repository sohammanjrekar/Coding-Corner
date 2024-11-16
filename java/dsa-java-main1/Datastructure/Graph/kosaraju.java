package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class kosaraju {
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
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 1));
        graph[3].add(new edge(3, 4));

    }

    public static void topsort(ArrayList<edge> graph[], int curr, boolean visited[], Stack<Integer> s) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!visited[e.destination]) {
                topsort(graph, e.destination, visited, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr);
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!visited[e.destination]) {
                dfs(graph, e.destination, visited);

            }
        }
    }

    public static void kosarajualgo(ArrayList<edge> graph[], int v) {
        // step1 topology sorting
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                topsort(graph, i, visited, s);
            }
        }
        // step 2 transopse
        ArrayList<edge> transpose_graph[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            visited[i] = false;
            transpose_graph[i] = new ArrayList<edge>();
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j); // e.src(i)-> e.destination(i)
                transpose_graph[e.destination].add(new edge(e.destination, e.source));
            }
        }
        // step3
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                dfs(transpose_graph, curr, visited);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        kosarajualgo(graph, v);
    }
}
